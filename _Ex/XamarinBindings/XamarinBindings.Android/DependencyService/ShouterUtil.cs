using Com.Haiyangrpdev.Sayhello;
using Plugin.CurrentActivity;
using System;
using Xamarin.Forms;
using XamarinBindings.Utility;

[assembly: Dependency(typeof(XamarinBindings.Droid.DependencyService.ShouterUtil))]
namespace XamarinBindings.Droid.DependencyService
{
    public class ShouterUtil : IShouterUtil
    {
        public void ShoutIt(bool isToast)
        {
            try
            {
                var context = CrossCurrentActivity.Current.Activity;
                Shouter shout = new Shouter(context);
                shout.ShoutHello(isToast);
            }
            catch (Exception ex)
            {
                //log here...
            }
        }
    }
}