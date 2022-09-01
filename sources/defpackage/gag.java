package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl;
import com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl;
import com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl;
import com.google.android.gms.learning.dynamite.training.InAppTrainerImpl;
import com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl;

/* compiled from: PG */
/* renamed from: gag  reason: default package */
/* loaded from: classes.dex */
final class gag implements gac {
    public gag(Context context) {
        fxf.a();
        jnk b = jnk.b(context);
        try {
            ((fwo) b.c(fwo.class)).d(jnx.FAT_DYNAMITE_LOADER_USED);
            if (b == null) {
                return;
            }
            b.close();
        } catch (Throwable th) {
            if (b != null) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.gac
    public final void a(Context context) {
        boe a = fwd.a();
        if (a == null) {
            throw new gad("BrellaInit.setFatSdkConfig(...) must be called in Application#onCreate");
        }
        if (a.e()) {
            jnk b = jnk.b(context);
            try {
                ((fwo) b.c(fwo.class)).d(jnx.CUSTOM_NATIVE_LIBRARY_LOADED);
                if (b == null) {
                    return;
                }
                b.close();
                return;
            } catch (Throwable th) {
                if (b != null) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                }
                throw th;
            }
        }
        System.loadLibrary("Brella");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.gac
    public final IInterface b(String str, gae gaeVar) {
        char c;
        IBinder inAppJobServiceImpl;
        if (fwd.a() == null) {
            throw new gad("BrellaInit.setFatSdkConfig(...) must be called in Application#onCreate");
        }
        switch (str.hashCode()) {
            case -1192512253:
                if (str.equals("com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -487058244:
                if (str.equals("com.google.android.gms.learning.dynamite.training.InAppTrainerImpl")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1142080332:
                if (str.equals("com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1556299985:
                if (str.equals("com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2016770690:
                if (str.equals("com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            inAppJobServiceImpl = new InAppJobServiceImpl();
        } else if (c == 1) {
            inAppJobServiceImpl = new InAppTrainingServiceImpl();
        } else if (c == 2) {
            inAppJobServiceImpl = new InAppTrainerImpl();
        } else if (c == 3) {
            inAppJobServiceImpl = new InAppTrainerCancellerImpl();
        } else if (c == 4) {
            inAppJobServiceImpl = new InAppExampleStoreProxyImpl();
        } else {
            throw new gad("no impl found for ".concat(str));
        }
        IInterface a = gaeVar.a(inAppJobServiceImpl);
        if (a == null) {
            throw new gad("null impl for ".concat(str));
        }
        return a;
    }
}
