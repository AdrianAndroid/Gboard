package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.apps.inputmethod.libs.translate.SystemTranslateProvider;

/* compiled from: PG */
/* renamed from: fkb  reason: default package */
/* loaded from: classes.dex */
public final class fkb implements mka {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fkb(eym eymVar, int i) {
        this.b = i;
        this.a = eymVar;
    }

    public fkb(hpr hprVar, int i) {
        this.b = i;
        this.a = hprVar;
    }

    public fkb(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    public fkb(kcq kcqVar, int i, byte[] bArr) {
        this.b = i;
        this.a = kcqVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [eym, java.lang.Object] */
    @Override // defpackage.mka
    public final void a(Throwable th) {
        int i = this.b;
        if (i == 0) {
            ((kcq) this.a).y(th);
        } else if (i == 1) {
            SystemTranslateProvider.e(this.a, SystemTranslateProvider.c);
            ((ltd) ((ltd) ((ltd) SystemTranslateProvider.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/translate/SystemTranslateProvider$1", "onFailure", (char) 139, "SystemTranslateProvider.java")).s();
        } else if (i == 2) {
            lgf.f(th);
            throw new AssertionError(th);
        } else {
            ((ltd) ((ltd) ((ltd) hpr.a.d()).i(th)).k("com/google/android/libraries/inputmethod/inputconnection/InputConnectionAction$1", "onFailure", (char) 716, "InputConnectionAction.java")).t("Failed to perform commitText");
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, fjr] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, fkd] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.mka
    public final void b(Object obj) {
        ijk ijkVar;
        int a;
        int i = this.b;
        if (i == 0) {
            Object obj2 = this.a;
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            kcq kcqVar = (kcq) obj2;
            kcqVar.c.c(bundle, "result", obj, (fke) kcqVar.a);
            try {
                new fkf(((kcq) obj2).b).makeBundleCall(bundle);
            } catch (fka unused) {
                Log.e("FutureResult", "Connection was dropped before response");
            } catch (RuntimeException e) {
                kcqVar.y(new fka("Error when writing result of future", e));
            }
        } else if (i == 1) {
        } else {
            if (i == 2) {
                this.a.run();
                return;
            }
            hrx hrxVar = (hrx) ((dcu) ((hpr) this.a).i.a).w;
            if (hrxVar.Q == null) {
                ((ltd) ((ltd) hrx.a.c()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "notifyUserAction", 2455, "InputMethodEntryManager.java")).t("The dynamic rotation list shouldn't be null.");
                return;
            }
            hqt b = hqp.b();
            if (b == null || (a = (ijkVar = hrxVar.Q).a(b)) <= 0) {
                return;
            }
            Object obj3 = ijkVar.a;
            int i2 = ((int[]) obj3)[a];
            System.arraycopy(obj3, 0, obj3, 1, a);
            ((int[]) ijkVar.a)[0] = i2;
        }
    }
}
