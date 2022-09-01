package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: eom  reason: default package */
/* loaded from: classes.dex */
public final class eom {
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/splitprompt/DupKeyDetector");
    public final List a = new ArrayList();
    public final List b = new ArrayList();

    public eom(Context context) {
        hsk b = hsx.b();
        if (b == null) {
            ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/splitprompt/DupKeyDetector", "<init>", 23, "DupKeyDetector.java")).t("ServiceLifeCycleNotification does not have a GoogleInputMethodService instance.");
            return;
        }
        View G = b.G();
        if (G == null) {
            ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/splitprompt/DupKeyDetector", "<init>", 28, "DupKeyDetector.java")).t("KeyboardArea is null");
            return;
        }
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(R.array.f1230_resource_name_obfuscated_res_0x7f030015);
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            View findViewById = G.findViewById(obtainTypedArray.getResourceId(i, 0));
            if (findViewById != null) {
                this.a.add(findViewById);
                View findViewById2 = findViewById.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745);
                if (findViewById2 instanceof TextView) {
                    this.b.add(((TextView) findViewById2).getText());
                }
            }
        }
        obtainTypedArray.recycle();
    }
}
