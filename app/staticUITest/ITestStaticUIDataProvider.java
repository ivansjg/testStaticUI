package staticUITest;

import play.mvc.*;
import play.data.validation.Validation;

public interface ITestStaticUIDataProvider {
    public void addArgs(Scope.RenderArgs args);
    public void addSession(Scope.Session session);
    public void addFlash(Scope.Flash flash);
    public void addValidationErrors(Validation validation);
}
