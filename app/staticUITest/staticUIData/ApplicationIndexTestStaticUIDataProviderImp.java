package staticUITest.staticUIData;

import java.util.ArrayList;
import java.util.Arrays;

import play.mvc.*;
import play.data.validation.Validation;
import play.i18n.Messages;

import staticUITest.ITestStaticUIDataProvider;

public class ApplicationIndexTestStaticUIDataProviderImp implements ITestStaticUIDataProvider {
    public void addArgs(Scope.RenderArgs args) {
        ArrayList<String> nationalities = new ArrayList<String>(
                                                Arrays.asList(Messages.get("spanish"), Messages.get("english"), Messages.get("french"))
                                          );

        args.put("nationalities", nationalities);
    }

    public void addSession(Scope.Session session) {

    }

    public void addFlash(Scope.Flash flash) {
        flash.error("lalalalala");
    }

    public void addValidationErrors(Validation validation) {
        validation.addError("user.name", "validation.user_name");
        validation.addError("acceptConditions", "validation.mustAcceptConditions");
    }
}
