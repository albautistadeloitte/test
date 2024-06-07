// Homework
// take 20 tables, and print each row element for each column




// Sometime you cant use find or stream


// This is 90% of the API find
// api.stream amazing for large data tables
def cost = 0
api.stream("P",null, null, null)
.withCloseable  { e ->
    e?.each { row ->
        api.trace("Iterator Row: ", row)
        cost += row?.createdBy
    }
}
api.trace("Costs ", cost)


// api.find is amazing if the data is small, for company parameters, etc
names2 = api.find("P",0, 0, null, null, null)



// Homework
// take 20 tables, and print each row element for each column



return api.stream("U", null, ["id", "loginName", "firstName", "lastName"])
        ?.withCloseable {
            it.collectEntries { u ->
                [(u.id): "${u.firstName} ${u.lastName} (${u.loginName})"]
            }
        }


test1.each {bla ->
    api.trace("item", bla)
}





// api.find
def x =  api.find("P"
        ,0
        ,10,
        "-ProductId",
        ["ProductId", "label"],
        // Filter.or(
                // Filter.greaterThan("ProductId", "Meal")
               // Filter.equal("ProductId", "Meal-C092"),
                // Filter.equal("ProductId", "Meal-C090"),
      //  )
        )

//api.trace("find found", x)
//
//x.each {bla ->
//    api.trace("item", bla)
//}


// api.find
def y =  api.find("PAM"
        ,0
        ,10,
        "createDate",
        ["createDate", "createdBy"],
        // Filter.or(
        // Filter.greaterThan("ProductId", "Meal")
        // Filter.equal("ProductId", "Meal-C092"),
        // Filter.equal("ProductId", "Meal-C090"),
        //  )
)

api.trace("find found", y)

y.each {bla ->
    api.trace("item", bla)
}



//while (data = api.find("P", start, api.getMaxFindResultsLimit(), "sku", fields)){
//    start += data.size()
//    for(row in data){
//        def out = [
//                "sku"           : row.sku,
//                "ProductGroup"  : row.attribute1,
//                "BusinessUnit"  : row.attribute2
//        ]
//        api.trace("Row: ", out)
//    }
//}

