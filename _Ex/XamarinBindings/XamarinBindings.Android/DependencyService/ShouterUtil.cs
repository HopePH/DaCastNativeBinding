using Com.Haiyangrpdev.Sayhello;
using Plugin.CurrentActivity;
using Xamarin.Forms;
using XamarinBindings.Utility;

[assembly: Dependency(typeof(XamarinBindings.Droid.DependencyService.ShouterUtil))]
namespace XamarinBindings.Droid.DependencyService
{
    public class ShouterUtil : IShouterUtil
    {
        private bool _isToast = true;
        public void ShoutIt()
        {
            try
            {
                var activity = CrossCurrentActivity.Current.Activity;
                Shouter shout = new Shouter(activity);
                shout.ShoutHello(_isToast);
            }
            catch { }
        }
    }
}