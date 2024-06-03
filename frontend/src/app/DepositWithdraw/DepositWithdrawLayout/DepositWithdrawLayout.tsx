"use client";
import { useRouter } from "next/navigation"
export default function DepositWithdrawLayout(){;
    const router = useRouter();

    const depositRoute = () =>{
        router.push('/DepositWithdraw/Deposit')
    }
    const withdrawRoute = () =>{
        router.push('/DepositWithdraw/Withdraw')
    }
    return(
        <>
        <div className="flex gap-4 flex-col">
              <button className="btn btn-wide btn-neutral text-xl"onClick={depositRoute}>Deposit</button>
              <button className="btn btn-wide btn-neutral text-xl"onClick={withdrawRoute}>Withdraw</button>
              </div>
            
           

            
        </>
    )
}

