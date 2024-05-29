import DashboardInformationSection from "./DashboardComponents/DashboardInformationSection"
import DashboardNavigationSection from "./DashboardComponents/DashboardNavigationSection"
export default function Dashboard(){
  return (
    <div className="mt-5 p-5 bg-gray-700 rounded-md">
        <DashboardNavigationSection />
        <DashboardInformationSection />
    </div>
  )
}

