const DashboardInformationSection = () => {
  return (
    <div className="pt-5 flex gap-2">
        {/* Left Section */}
        <div className="w-1/2 flex-col">
            <div className="flex gap-2">
                <div className="w-1/2 p-10 bg-gray-300 justify-center text-center rounded-lg">Coming soon</div>
                <div className="w-1/2 p-10 bg-gray-300 justify-center text-center rounded-lg">Coming soon</div>
        </div>
        <div className=" mt-2 flex gap-1">
                <div className="w-1/2 p-10 bg-gray-300 justify-center text-center rounded-lg">Coming soon</div>
                <div className="w-1/2 p-10 bg-gray-300 justify-center text-center rounded-lg">Coming soon</div>
        </div>
        </div>
        {/* Right Section */}
        <div className="w-1/2">
            <div className="flex bg-gray-300 h-full justify-center text-center rounded-xl">Coming soon</div>
        </div>
    </div>
  )
}

export default DashboardInformationSection