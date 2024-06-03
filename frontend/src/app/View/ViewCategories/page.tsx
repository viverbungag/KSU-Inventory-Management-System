import Dashboard from "@/app/Components/Dashboard/Dashboard"

const ViewCategories = () => {
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
              <input type="text" placeholder="Type here" className="input input-bordered w-full max-w-xs" />
              <div>
                <h1>To follow</h1>
              </div>
              </div>
            </div>
   </Dashboard>
   </>
  )
}

export default ViewCategories