"use client";
import { useRouter } from "next/navigation"

export default function DashboardNavigationSection(){
  const router = useRouter();

  const DepWithoute = () =>{
    router.push('/DepositWithdraw/Deposit')
  }
  const productRoute = () =>{
    router.push('/Products/NewProduct')
  }
  const viewRoute = () =>{
    router.push('/View/ViewProducts')
  }

  return (
    <div>
        <div className="flex justify-between">
        <button className="btn btn-wide btn-neutral"onClick={DepWithoute}>Deposit/Withdraw Products</button>
        <button className="btn btn-wide btn-neutral text-xl" onClick={productRoute}>Products</button>
        <button className="btn btn-wide btn-neutral text-xl"onClick={viewRoute}>View</button>
        <button className="btn btn-wide btn-neutral text-xl">Edit</button>
        <button className="btn btn-wide btn-neutral text-xl">Reports</button>
        </div>
    </div>
  )
}

