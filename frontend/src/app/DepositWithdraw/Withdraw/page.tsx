import Dashboard from "../../Components/Dashboard/Dashboard"
import DepositWithdrawLayout from "../DepositWithdrawLayout/DepositWithdrawLayout"


export default function Withdraw(){
   
    return(
        <>
        
        <Dashboard header="Deposit/Withdraw">
            
           <DepositWithdrawLayout>
           <div className="flex m-5 p-5">
              <div className="flex gap-4 bg-red-700 flex-col">
              <button className="btn btn-wide btn-neutral text-xl">Deposit</button>
              <button className="btn btn-wide btn-neutral text-xl">Withdraw</button>
              </div>
              <div className="mx-4">
                <form className="flex flex-col">
                   <label className="p-2">Product Name</label>
                   <input type="text" />
                   <label className="p-2">Category</label>
                   <input type="text" disabled />
                   <label className="p-2">Unit of measurement</label>
                   <input type="text" disabled />
                   <label className="p-2">Quantity</label>
                   <input type="number" />
                   <label className="p-2">Price</label>
                   <input type="number" /> 
                   
                   <button>Withdraw</button>
                </form>
              </div>
            </div>
           </DepositWithdrawLayout>

             </Dashboard>
        </>
    )
}