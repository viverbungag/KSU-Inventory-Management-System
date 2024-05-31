import DashboardInformationSection from "./DashboardComponents/DashboardInformationSection"
import DashboardNavigationSection from "./DashboardComponents/DashboardNavigationSection"

type headerProps = {
  header:string
  children?: React.ReactNode;
}
// Layout sa dashboard
const Dashboard: React.FC<headerProps> = ({ header, children }) => (
 
    <div>
      <h1>{header}</h1>
    <div className="mt-5 p-5 bg-gray-700 rounded-md">
        <DashboardNavigationSection />
        {children}
    </div>
    </div>
  )
export default Dashboard

