package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fso  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fso implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fso(Activity activity, Intent intent, int i) {
        this.c = i;
        this.a = activity;
        this.b = intent;
    }

    public /* synthetic */ fso(IBinder iBinder, IBinder.DeathRecipient deathRecipient, int i) {
        this.c = i;
        this.b = iBinder;
        this.a = deathRecipient;
    }

    public fso(fqb fqbVar, gec gecVar, int i) {
        this.c = i;
        this.a = fqbVar;
        this.b = gecVar;
    }

    public /* synthetic */ fso(fsp fspVar, String str, int i) {
        this.c = i;
        this.a = fspVar;
        this.b = str;
    }

    public /* synthetic */ fso(fze fzeVar, fzd fzdVar, int i) {
        this.c = i;
        this.b = fzeVar;
        this.a = fzdVar;
    }

    public fso(gee geeVar, gen genVar, int i) {
        this.c = i;
        this.a = geeVar;
        this.b = genVar;
    }

    public fso(gef gefVar, gen genVar, int i) {
        this.c = i;
        this.a = gefVar;
        this.b = genVar;
    }

    public fso(gei geiVar, gen genVar, int i) {
        this.c = i;
        this.a = geiVar;
        this.b = genVar;
    }

    public fso(gei geiVar, gen genVar, int i, byte[] bArr) {
        this.c = i;
        this.a = geiVar;
        this.b = genVar;
    }

    public fso(gei geiVar, gen genVar, int i, char[] cArr) {
        this.c = i;
        this.a = geiVar;
        this.b = genVar;
    }

    public fso(ger gerVar, Callable callable, int i) {
        this.c = i;
        this.a = gerVar;
        this.b = callable;
    }

    public /* synthetic */ fso(gug gugVar, guf gufVar, int i) {
        this.c = i;
        this.b = gugVar;
        this.a = gufVar;
    }

    public /* synthetic */ fso(gxe gxeVar, Object obj, int i) {
        this.c = i;
        this.a = gxeVar;
        this.b = obj;
    }

    public /* synthetic */ fso(gxe gxeVar, ExecutionException executionException, int i) {
        this.c = i;
        this.a = gxeVar;
        this.b = executionException;
    }

    public /* synthetic */ fso(ijk ijkVar, Intent intent, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = i;
        this.b = ijkVar;
        this.a = intent;
    }

    public /* synthetic */ fso(Class cls, gnm gnmVar, int i) {
        this.c = i;
        this.b = cls;
        this.a = gnmVar;
    }

    public /* synthetic */ fso(Throwable th, Context context, int i) {
        this.c = i;
        this.b = th;
        this.a = context;
    }

    public /* synthetic */ fso(mko mkoVar, Context context, int i) {
        this.c = i;
        this.b = mkoVar;
        this.a = context;
    }

    public /* synthetic */ fso(mko mkoVar, fyk fykVar, int i) {
        this.c = i;
        this.b = mkoVar;
        this.a = fykVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r0v42, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r1v42, types: [fyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.Object, gej] */
    /* JADX WARN: Type inference failed for: r1v72, types: [java.lang.Object, gek] */
    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Object, gel] */
    /* JADX WARN: Type inference failed for: r1v77, types: [gnm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v79, types: [guf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, gel] */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.os.IBinder$DeathRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.os.IBinder$DeathRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, gek] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, geh] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                Object obj = this.a;
                ((jop) ((fsp) obj).g.a).a.c(this.b);
                return;
            case 1:
                Object obj2 = this.a;
                gec gecVar = (gec) this.b;
                fmt fmtVar = gecVar.b;
                if (fmtVar.b()) {
                    frr frrVar = gecVar.c;
                    fyb.ax(frrVar);
                    fmt fmtVar2 = frrVar.c;
                    if (!fmtVar2.b()) {
                        String valueOf = String.valueOf(fmtVar2);
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(valueOf)), new Exception());
                        fqb fqbVar = (fqb) obj2;
                        fqbVar.f.b(fmtVar2);
                        fqbVar.e.l();
                        return;
                    }
                    fqb fqbVar2 = (fqb) obj2;
                    fpi fpiVar = fqbVar2.f;
                    frg a = frrVar.a();
                    Set set = fqbVar2.c;
                    if (a == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        fpiVar.b(new fmt(4));
                    } else {
                        fpiVar.f = a;
                        fpiVar.c = set;
                        fpiVar.c();
                    }
                } else {
                    ((fqb) obj2).f.b(fmtVar);
                }
                ((fqb) obj2).e.l();
                return;
            case 2:
                ((Activity) ((ijk) this.b).b).startActivity((Intent) this.a);
                return;
            case 3:
                ((Activity) this.a).startActivityForResult((Intent) this.b, 123);
                return;
            case 4:
                ?? r0 = this.b;
                ?? r1 = this.a;
                if (!r0.isCancelled()) {
                    return;
                }
                InAppTrainingServiceImpl.i(new fyq(r1, 7));
                return;
            case 5:
                InAppTrainingServiceImpl.b(this.b, (Context) this.a);
                return;
            case 6:
                Object obj3 = this.b;
                Object obj4 = this.a;
                mll mllVar = new mll((Throwable) obj3);
                fyb.y((Context) obj4, mllVar);
                throw mllVar;
            case 7:
                this.b.unlinkToDeath(this.a, 0);
                return;
            case 8:
                ((fze) this.b).c((fzd) this.a);
                return;
            case 9:
                fze.b(this.b, (Context) this.a);
                return;
            case 10:
                this.b.unlinkToDeath(this.a, 0);
                return;
            case 11:
                if (((ger) this.b).c) {
                    ((gee) this.a).a.p();
                    return;
                }
                try {
                    ((gee) this.a).a.o(kkb.c((gen) this.b));
                    return;
                } catch (gem e) {
                    if (e.getCause() instanceof Exception) {
                        ((gee) this.a).a.n((Exception) e.getCause());
                        return;
                    } else {
                        ((gee) this.a).a.n(e);
                        return;
                    }
                } catch (Exception e2) {
                    ((gee) this.a).a.n(e2);
                    return;
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                try {
                    gen genVar = (gen) ((gef) this.a).a.a((gen) this.b);
                    if (genVar == 0) {
                        ((gef) this.a).d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    genVar.l(gep.b, this.a);
                    genVar.h(gep.b, this.a);
                    genVar.f(gep.b, this.a);
                    return;
                } catch (gem e3) {
                    if (e3.getCause() instanceof Exception) {
                        ((gef) this.a).b.n((Exception) e3.getCause());
                        return;
                    } else {
                        ((gef) this.a).b.n(e3);
                        return;
                    }
                } catch (Exception e4) {
                    ((gef) this.a).b.n(e4);
                    return;
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                synchronized (((gei) this.a).a) {
                    ?? r12 = ((gei) this.a).b;
                    if (r12 != 0) {
                        r12.a((gen) this.b);
                    }
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                synchronized (((gei) this.a).a) {
                    ?? r13 = ((gei) this.a).b;
                    if (r13 != 0) {
                        Exception b = ((gen) this.b).b();
                        fyb.ax(b);
                        r13.d(b);
                    }
                }
                return;
            case 15:
                synchronized (((gei) this.a).a) {
                    ?? r14 = ((gei) this.a).b;
                    if (r14 != 0) {
                        r14.e(((gen) this.b).c());
                    }
                }
                return;
            case 16:
                try {
                    ((ger) this.a).o(this.b.call());
                    return;
                } catch (Exception e5) {
                    ((ger) this.a).n(e5);
                    return;
                } catch (Throwable th) {
                    ((ger) this.a).n(new RuntimeException(th));
                    return;
                }
            case 17:
                Object obj5 = this.b;
                ?? r15 = this.a;
                Class a2 = gno.a((Class) obj5);
                try {
                    r15.a();
                    return;
                } finally {
                    gno.a(a2);
                }
            case 18:
                Object obj6 = this.b;
                ?? r16 = this.a;
                gug gugVar = (gug) obj6;
                if (!gugVar.f()) {
                    return;
                }
                r16.dismiss();
                ((ltd) ((ltd) gug.a.c()).k("com/google/android/libraries/inputmethod/alertdialog/AlertDialogFragmentPeer", "lambda$waitAlertDialogNotificationListener$1", 132, "AlertDialogFragmentPeer.java")).w("Auto dismiss dialog '%s' as it is not reshow in time", gugVar.b);
                return;
            case 19:
                Object obj7 = this.a;
                Object obj8 = this.b;
                gxe gxeVar = (gxe) obj7;
                if (!gxeVar.d) {
                    gxeVar.c(obj8);
                }
                gxeVar.a();
                return;
            default:
                Object obj9 = this.a;
                Object obj10 = this.b;
                Throwable cause = ((ExecutionException) obj10).getCause();
                if (cause != null) {
                    obj10 = cause;
                }
                ((luc) ((luc) ((luc) gxe.a.c()).i((Throwable) obj10)).k("com/google/android/libraries/inputmethod/concurrent/AsyncTaskAdapter", "onFailure", 124, "AsyncTaskAdapter.java")).t("Caught exception during task execution");
                ((gxe) obj9).a();
                return;
        }
    }
}
