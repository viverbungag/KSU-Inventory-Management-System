import Dashboard from "@/app/Components/Dashboard/Dashboard"

const NewProduct = () => {
  return (
   <>
   <Dashboard header="New Branch">
   <div className="flex m-5 p-5">
              <div className="flex gap-4 bg-red-700 flex-col">
              <button className="btn btn-wide btn-neutral text-xl">New Product</button>
              <button className="btn btn-wide btn-neutral text-xl">New Branch</button>
              <button className="btn btn-wide btn-neutral text-xl">New Unit</button>
              <button className="btn btn-wide btn-neutral text-xl">New Supplier</button>
              <button className="btn btn-wide btn-neutral text-xl">New Category</button>
              </div>
              <div className="mx-4">
                <form className="flex flex-col">
                   <label className="p-2">Product Name</label>
                   <input type="text" />
                   <label className="p-2">Category</label>
                   <input type="text" />
                   <label className="p-2">Sub Category</label>
                   <input type="text" />
                   <label className="p-2">Unit of measurement</label>
                   <input type="text" />
                   <label className="p-2">Minimum Quantity</label>
                   <input type="text" />
                  
                   
                   <button>Add Product</button>
                </form>
              </div>
            </div>
   </Dashboard>
   </>
  )
}

export default NewProduct