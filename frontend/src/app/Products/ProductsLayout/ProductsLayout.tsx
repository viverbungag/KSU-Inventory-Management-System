"use client";
import { useRouter } from "next/navigation";



const ProductsLayout = () => {
    const router = useRouter();

    const productRoute = () =>{
        router.push('./NewProduct')
    }
    const branchRoute = () =>{
        router.push('./NewBranch')
    }
    const supplierRoute = () =>{
        router.push('./NewSupplier')
    }
    const unitRoute = () =>{
        router.push('./NewUnit')
    }
    const categoryRoute = () =>{
        router.push('./NewCategory')
    }
  return (
    <div>
        <div className="flex gap-4 flex-col">
              <button className="btn btn-wide btn-neutral text-xl"onClick={productRoute}>New Product</button>
              <button className="btn btn-wide btn-neutral text-xl"onClick={branchRoute}>New Branch</button>
              <button className="btn btn-wide btn-neutral text-xl"onClick={unitRoute}>New Unit</button>
              <button className="btn btn-wide btn-neutral text-xl"onClick={supplierRoute}>New Supplier</button>
              <button className="btn btn-wide btn-neutral text-xl" onClick={categoryRoute}>New Category</button>
              </div>
    </div>
  )
}

export default ProductsLayout