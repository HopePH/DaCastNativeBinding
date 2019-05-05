using Prism.Commands;
using Prism.Navigation;
using System.Windows.Input;

namespace XamarinBindings.ViewModels
{
    public class MainPageViewModel : ViewModelBase
    {
        public ICommand ShoutCommand => new DelegateCommand(ShoutIt);

        public MainPageViewModel(INavigationService navigationService)
            : base(navigationService)
        {
            Title = "Main Page";
        }

        private void ShoutIt()
        {

        }
    }
}
