package com.google.android.apps.inputmethod.libs.framework.firstrun;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v7.widget.AppCompatTextView;
import android.text.Html;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PermissionStepPage extends dde {
    private final ijt c;

    public PermissionStepPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = ijt.e(context);
    }

    @Override // defpackage.dde
    protected final CharSequence a() {
        return Html.fromHtml(getResources().getString(R.string.f152240_resource_name_obfuscated_res_0x7f140269, getResources().getString(R.string.ime_name)));
    }

    @Override // defpackage.dde
    public final void b() {
        ijt ijtVar = this.c;
        ArrayList A = lre.A();
        ArrayList A2 = lre.A();
        for (Map.Entry entry : ijtVar.d.entrySet()) {
            String str = (String) entry.getKey();
            if (ijtVar.m(str) && ijw.d(ijtVar.b, ((ijr) entry.getValue()).b, A2)) {
                A.add(str);
            }
        }
        if (!A.isEmpty()) {
            int a = ijtVar.a();
            ((ltd) ((ltd) ijt.a.b()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "checkAndRequestFeaturePermissions", 253, "FeaturePermissionsManager.java")).J("RequestCode = %d : RequestedFeatures = %s : DeniedPermissions = %s", Integer.valueOf(a), A, A2);
            ijtVar.f(a, A);
            ijtVar.r(a, null, A2);
        }
    }

    @Override // defpackage.dde
    protected final boolean c() {
        return this.c.p().length == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dde, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Context context = getContext();
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.f55390_resource_name_obfuscated_res_0x7f0b0204);
        String[] strArr = ((ddi) context).s;
        PackageManager packageManager = context.getPackageManager();
        ArrayList A = lre.A();
        for (String str : strArr) {
            try {
                CharSequence loadLabel = packageManager.getPermissionInfo(str, 0).loadLabel(packageManager);
                if (!A.contains(loadLabel)) {
                    A.add(loadLabel);
                }
            } catch (PackageManager.NameNotFoundException e) {
                ((ltd) ((ltd) ((ltd) ijw.a.d()).i(e)).k("com/google/android/libraries/inputmethod/permissions/PermissionsUtil", "getPermissionLabels", 202, "PermissionsUtil.java")).w("Can't find permission %s", str);
            }
        }
        appCompatTextView.setText(lex.d("\n").g((CharSequence[]) A.toArray(new CharSequence[0])));
    }
}
