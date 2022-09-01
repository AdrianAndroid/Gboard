package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: inx  reason: default package */
/* loaded from: classes.dex */
public class inx extends gut {
    public final void A() {
        List j = hB().j();
        int size = j.size();
        String str = null;
        an anVar = size > 0 ? (an) j.get(size - 1) : null;
        Bundle bundle = anVar != null ? anVar.m : null;
        if (bundle != null) {
            str = bundle.getString("fragment_title");
        }
        if (!TextUtils.isEmpty(str)) {
            setTitle(str);
            return;
        }
        bi hB = hB();
        int a = hB.a();
        if (a <= 0) {
            return;
        }
        bd bdVar = (bd) hB.b.get(a - 1);
        int a2 = bdVar.a();
        if (a2 != 0) {
            setTitle(a2);
            return;
        }
        CharSequence b = bdVar.b();
        if (TextUtils.isEmpty(b)) {
            return;
        }
        setTitle(b);
    }

    public final void B(Preference preference) {
        z(preference.v, preference.r(), preference.q);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public an n() {
        return new iny();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gut, defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bi hB = hB();
        if (hB.f == null) {
            hB.f = new ArrayList();
        }
        hB.f.add(this);
        if (bundle == null) {
            w(n(), getTitle());
        } else {
            A();
        }
    }

    public final void y(an anVar, int i, Intent intent) {
        onBackPressed();
        an z = anVar.z();
        if (z != null) {
            z.P(anVar.fR(), i, intent);
        }
    }

    public final void z(String str, Bundle bundle, CharSequence charSequence) {
        w(an.A(this, str, bundle), charSequence);
    }
}
