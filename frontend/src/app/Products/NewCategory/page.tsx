import Dashboard from "@/app/Components/Dashboard/Dashboard"
import ProductsLayout from "../ProductsLayout/ProductsLayout"
const NewBranch = () => {
  return (
   <>
   <Dashboard header="New Category">
   <div className="flex m-5 p-5">
   <ProductsLayout />
              <div className="mx-4">
                <form className="flex flex-col">
                   <label className="p-2">Category Name</label>
                   <input type="text" />
                  
                   
                   <button>Add Category</button>
                </form>
              </div>
            </div>
   </Dashboard>
   </>
  )
}

export default NewBranch