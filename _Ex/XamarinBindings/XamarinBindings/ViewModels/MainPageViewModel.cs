using Prism.Commands;
using Prism.Navigation;
using Prism.Services;
using System.Windows.Input;
using XamarinBindings.Utility;

namespace XamarinBindings.ViewModels
{
    public class MainPageViewModel : ViewModelBase
    {
        private readonly IShouterUtil _shouter;

        public ICommand ShoutCommand => new DelegateCommand(ShoutIt);

        public MainPageViewModel(INavigationService navigationService,
            IDependencyService dependencyService)
            : base(navigationService)
        {
            Title = "Main Page";
            _shouter = dependencyService.Get<IShouterUtil>();
        }

        private void ShoutIt()
            => _shouter.ShoutIt(true);
    }
}
