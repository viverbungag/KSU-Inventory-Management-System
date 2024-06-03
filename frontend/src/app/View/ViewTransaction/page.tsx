import Dashboard from "@/app/Components/Dashboard/Dashboard"
import ViewLayout from "../ViewLayout/ViewLayout"
const ViewTransactions = () => {
  return (
   <>
   <Dashboard header="New Branch">
   <div className="flex m-5 p-5">
                <ViewLayout />
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

export default ViewTransactions