package butterknife.compiler;

import java.util.List;

/**
 * Created by Dhruv on 3/23/18.
 */

public class TrackMethodViewBinding extends MethodViewBinding {

    private final String mFunctionName;

    TrackMethodViewBinding(String name, List<Parameter> parameters, boolean required, String functionName) {
        super(name, parameters, required);
        mFunctionName = functionName;
    }

    public String getFunctionName() {
        return mFunctionName;
    }
}
