"use client";
import { useRouter } from "next/navigation"


const ViewLayout = () => {
    const router = useRouter();

    const prodView = () =>{
        router.push('./ViewProducts');
    }
    const transView = () =>{
        router.push('./ViewTransaction');
    }
    const suppView = () =>{
        router.push('./ViewSuppliers');
    }
    const catView = () =>{
        router.push('./ViewCategories');
    }
  return (
    <div>
        <div className="flex gap-4 flex-col">
              <button className="btn btn-wide btn-neutral text-xl" onClick={prodView}>View Product</button>
              <button className="btn btn-wide btn-neutral text-xl"onClick={suppView}>View Supplier</button>
              <button className="btn btn-wide btn-neutral text-xl"onClick={catView}>View Category</button>
              <button className="btn btn-wide btn-neutral text-xl"onClick={transView}>View Transaction</button>
              </div>
    </div>
  )
}

export default ViewLayout