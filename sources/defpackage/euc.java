package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.inputmethod.libs.theme.builder.ThemeBuilderActivity;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.workprofile.TrampolineActivity;

/* compiled from: PG */
/* renamed from: euc  reason: default package */
/* loaded from: classes.dex */
public final class euc implements ety {
    private final String a;

    public euc(String str) {
        this.a = str;
    }

    @Override // defpackage.ety
    public final int a() {
        return R.layout.f146790_resource_name_obfuscated_res_0x7f0e05e8;
    }

    @Override // defpackage.ety
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ety
    public final void c(eua euaVar, euf eufVar, int i) {
        etw etwVar = (etw) euaVar;
        if (etwVar.o == null) {
            etwVar.e.e(erh.BUILDER_ACTIVITY_CREATED, new Object[0]);
            Intent intent = new Intent(etwVar.b, ThemeBuilderActivity.class);
            intent.setAction("android.intent.action.MAIN");
            int i2 = 101;
            if (jez.e(etwVar.b) && jez.i(etwVar.b)) {
                intent.putExtra("intent_extra_key_is_cross_profile", true);
                Intent intent2 = new Intent(etwVar.b, TrampolineActivity.class);
                intent2.putExtra("android.intent.extra.INTENT", intent);
                intent = intent2;
                i2 = 102;
            }
            etwVar.q.d(intent, i2, new Bundle());
        }
    }

    @Override // defpackage.ety
    public final void d(View view, etz etzVar) {
        if (jez.g(view.getContext())) {
            view.findViewById(R.id.f129910_resource_name_obfuscated_res_0x7f0b219e).setVisibility(etzVar == etz.LOADING ? 8 : 0);
            euf.G(view, etzVar);
        }
    }

    @Override // defpackage.ety
    public final boolean e(Context context) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof euc) {
            return this.a.equals(((euc) obj).a);
        }
        return false;
    }

    @Override // defpackage.ety
    public final boolean f(eul eulVar) {
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
