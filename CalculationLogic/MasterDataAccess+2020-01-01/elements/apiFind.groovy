//api.find("P",
//        0,
//        20,
//        "-createDate",
//        ["ProductGroup", "BusinessUnit", "createDate", "Size"],
//        Filter.equal("Size", "Medium")
//)



// api.find with Clousures
def count = 0
def y = api.find("PCOMP",
        0,
        20,
        "sku",
        ["sku", "createDate"],
        null
)

y.each {item ->
    count++
    api.trace ("Item: ${count} ", y)
}