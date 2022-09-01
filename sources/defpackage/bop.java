package defpackage;

import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bop  reason: default package */
/* loaded from: classes.dex */
final class bop implements ijs {
    final /* synthetic */ String a;
    final /* synthetic */ ijt b;
    final /* synthetic */ boq c;

    public bop(boq boqVar, String str, ijt ijtVar) {
        this.c = boqVar;
        this.a = str;
        this.b = ijtVar;
    }

    @Override // defpackage.ijs
    public final void a(String str, boolean z) {
        if (!z || !this.c.e) {
            return;
        }
        hkx.b(this.a);
        ((ltd) ((ltd) boq.b.b()).k("com/google/android/apps/inputmethod/latin/LatinIMEBase$1", "onFeatureChanged", 681, "LatinIMEBase.java")).t("maybePostContactsPermissionNotice(): Removing stale notice");
        ijr d = this.b.d(R.string.f161460_resource_name_obfuscated_res_0x7f1406b3);
        if (d == null) {
            ((ltd) ijt.a.a(hip.a).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "unregisterOnFeatureChangeListener", 733, "FeaturePermissionsManager.java")).u("Feature [%s] is not registered", R.string.f161460_resource_name_obfuscated_res_0x7f1406b3);
        } else {
            d.c.remove(this);
        }
    }

    @Override // defpackage.ijs
    public final /* synthetic */ void b() {
    }
}
