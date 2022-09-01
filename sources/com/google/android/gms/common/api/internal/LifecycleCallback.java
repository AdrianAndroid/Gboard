package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LifecycleCallback {
    public final fpq f;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(fpq fpqVar) {
        this.f = fpqVar;
    }

    private static fpq getChimeraLifecycleFragmentImpl(fpp fppVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static fpq l(Activity activity) {
        fpr fprVar;
        fqd fqdVar;
        Object obj = new fpp(activity).a;
        if (!(obj instanceof ap)) {
            WeakReference weakReference = (WeakReference) fpr.a.get(obj);
            if (weakReference != null && (fprVar = (fpr) weakReference.get()) != null) {
                return fprVar;
            }
            try {
                fpr fprVar2 = (fpr) ((Activity) obj).getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (fprVar2 == null || fprVar2.isRemoving()) {
                    fprVar2 = new fpr();
                    ((Activity) obj).getFragmentManager().beginTransaction().add(fprVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                fpr fprVar3 = fprVar2;
                fpr.a.put(obj, new WeakReference(fprVar3));
                return fprVar3;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        ap apVar = (ap) obj;
        WeakReference weakReference2 = (WeakReference) fqd.a.get(apVar);
        if (weakReference2 != null && (fqdVar = (fqd) weakReference2.get()) != null) {
            return fqdVar;
        }
        try {
            fqd fqdVar2 = (fqd) apVar.hB().e("SupportLifecycleFragmentImpl");
            if (fqdVar2 == null || fqdVar2.s) {
                fqdVar2 = new fqd();
                bq i = apVar.hB().i();
                i.o(fqdVar2, "SupportLifecycleFragmentImpl");
                i.k();
            }
            fqd.a.put(apVar, new WeakReference(fqdVar2));
            return fqdVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    public void c(int i, int i2, Intent intent) {
    }

    public void d(Bundle bundle) {
    }

    public void g(Bundle bundle) {
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public final Activity k() {
        Activity a = this.f.a();
        fyb.ax(a);
        return a;
    }
}
