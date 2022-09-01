package defpackage;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.dynamite.training.InAppTrainerImpl;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.accesspoint.widget.AccessPointsPanel;
import j$.util.Objects;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fqa  reason: default package */
/* loaded from: classes.dex */
public final class fqa implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fqa(Dialog dialog, int i) {
        this.b = i;
        this.a = dialog;
    }

    public /* synthetic */ fqa(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public /* synthetic */ fqa(AccessPointsPanel accessPointsPanel, int i) {
        this.b = i;
        this.a = accessPointsPanel;
    }

    public /* synthetic */ fqa(fpo fpoVar, int i) {
        this.b = i;
        this.a = fpoVar;
    }

    public /* synthetic */ fqa(fpt fptVar, int i) {
        this.b = i;
        this.a = fptVar;
    }

    public fqa(fqb fqbVar, int i) {
        this.b = i;
        this.a = fqbVar;
    }

    public /* synthetic */ fqa(fsr fsrVar, int i) {
        this.b = i;
        this.a = fsrVar;
    }

    public fqa(gei geiVar, int i, byte[] bArr) {
        this.b = i;
        this.a = geiVar;
    }

    public fqa(gkw gkwVar, int i) {
        this.b = i;
        this.a = gkwVar;
    }

    public /* synthetic */ fqa(grh grhVar, int i) {
        this.b = i;
        this.a = grhVar;
    }

    public /* synthetic */ fqa(grt grtVar, int i) {
        this.b = i;
        this.a = grtVar;
    }

    public /* synthetic */ fqa(gsh gshVar, int i) {
        this.b = i;
        this.a = gshVar;
    }

    public /* synthetic */ fqa(gsz gszVar, int i) {
        this.b = i;
        this.a = gszVar;
    }

    public /* synthetic */ fqa(gwv gwvVar, int i) {
        this.b = i;
        this.a = gwvVar;
    }

    public /* synthetic */ fqa(gxa gxaVar, int i) {
        this.b = i;
        this.a = gxaVar;
    }

    public /* synthetic */ fqa(jnk jnkVar, int i) {
        this.b = i;
        this.a = jnkVar;
    }

    public /* synthetic */ fqa(oir oirVar, int i, byte[] bArr) {
        this.b = i;
        this.a = oirVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [fpo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, geh] */
    @Override // java.lang.Runnable
    public final void run() {
        fsu fsuVar;
        int i;
        int i2;
        switch (this.b) {
            case 0:
                ((fqb) this.a).f.b(new fmt(4));
                return;
            case 1:
                Object obj = ((fpt) this.a).b;
                if (obj == null) {
                    return;
                }
                try {
                    ((idy) obj).a.j();
                    return;
                } catch (RuntimeException e) {
                    throw e;
                }
            case 2:
                Object obj2 = this.a;
                fsr fsrVar = (fsr) obj2;
                if (fsrVar.c == null) {
                    return;
                }
                try {
                    fsv fsvVar = ((fsr) obj2).c;
                    fsvVar.hJ(3, fsvVar.a());
                } catch (Exception unused) {
                    Log.e("DGHandleImpl", "Error while closing handle.");
                }
                fsrVar.c = null;
                fsuVar.b--;
                fsrVar.a.d();
                return;
            case 3:
                try {
                    this.a.b(new Status(0));
                    return;
                } catch (RemoteException e2) {
                    Log.w("ExmplStrChkngIterator", "Failed to call close IStatusCallback", e2);
                    return;
                }
            case 4:
                Object obj3 = this.a;
                if (obj3 == null) {
                    return;
                }
                ((jnk) obj3).close();
                return;
            case 5:
                Object obj4 = this.a;
                llp llpVar = InAppTrainerImpl.a;
                if (obj4 == null) {
                    return;
                }
                ((jnk) obj4).close();
                return;
            case 6:
                Object obj5 = this.a;
                llp llpVar2 = InAppTrainerImpl.a;
                if (obj5 == null) {
                    return;
                }
                ((jnk) obj5).close();
                return;
            case 7:
                synchronized (((gei) this.a).a) {
                    ?? r1 = ((gei) this.a).b;
                    if (r1 != 0) {
                        r1.c();
                    }
                }
                return;
            case 8:
                if (!((gkw) this.a).c.isCancelled()) {
                    return;
                }
                ((gkw) this.a).a();
                return;
            case 9:
                grh grhVar = (grh) this.a;
                grhVar.g = null;
                if (!grhVar.c.ai("access_points_showing_order")) {
                    String d = grhVar.c.d("pref_key_access_points_showing_order", null);
                    if (!TextUtils.isEmpty(d)) {
                        String[] split = d.split(";");
                        fxd fxdVar = fxd.l;
                        lmz lmzVar = grhVar.d;
                        Objects.requireNonNull(lmzVar);
                        lmz d2 = grh.d(split, fxdVar, new ein(lmzVar, 6));
                        if (!d2.isEmpty()) {
                            lmz h = grhVar.h();
                            if (h == null && (h = grhVar.f()) == null) {
                                h = grhVar.g();
                            }
                            llp k = h.k();
                            llp k2 = d2.k();
                            if (!lre.I(k, k2) && (k2.size() < (i = ((lrl) grh.b).c) || !lre.I(k2.subList(0, i), grh.b))) {
                                grh.i(grhVar.c, d2);
                            }
                        }
                        grhVar.c.w("pref_key_access_points_showing_order");
                    }
                }
                grhVar.k(grhVar.e());
                return;
            case 10:
                ((grt) this.a).r();
                return;
            case 11:
                gsh gshVar = (gsh) this.a;
                gshVar.n = null;
                gsf gsfVar = gshVar.j;
                if (gsfVar == null) {
                    return;
                }
                int[] iArr = gshVar.f;
                gshVar.c(0, iArr[0], iArr[1]);
                gsfVar.a.setVisibility(8);
                gqu x = gsfVar.b.x();
                gck z = gsfVar.d.z(gshVar.b, gsfVar.e);
                if (z == null) {
                    return;
                }
                gshVar.c.d(gshVar.a, gsfVar.c, z, x);
                if (gshVar.k == null) {
                    ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(gshVar.a, R.animator.f510_resource_name_obfuscated_res_0x7f020012);
                    ValueAnimator valueAnimator2 = (ValueAnimator) AnimatorInflater.loadAnimator(gshVar.a, R.animator.f510_resource_name_obfuscated_res_0x7f020012);
                    valueAnimator.addUpdateListener(gshVar.l);
                    valueAnimator2.addUpdateListener(gshVar.m);
                    gshVar.k = new AnimatorSet();
                    ((AnimatorSet) gshVar.k).play(valueAnimator).before(valueAnimator2);
                    gshVar.k.addListener(new gse(gshVar));
                }
                gsg gsgVar = gshVar.l;
                int[] iArr2 = gshVar.f;
                int i3 = iArr2[0];
                int i4 = iArr2[1];
                int[] iArr3 = gshVar.g;
                gsgVar.a(i3, i4, iArr3[0], iArr3[1]);
                gsg gsgVar2 = gshVar.m;
                int[] iArr4 = gshVar.g;
                int i5 = iArr4[0];
                int i6 = iArr4[1];
                int[] iArr5 = gshVar.h;
                gsgVar2.a(i5, i6, iArr5[0], iArr5[1]);
                gshVar.k.start();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                gsh gshVar2 = (gsh) this.a;
                gshVar2.o = null;
                if (gshVar2.i == null) {
                    return;
                }
                gsg gsgVar3 = gshVar2.m;
                int i7 = gsg.c;
                gshVar2.c(1, gsgVar3.a[0], gshVar2.m.a[1]);
                gshVar2.e(1500);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((gsh) this.a).d();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((oir) this.a).a = null;
                return;
            case 15:
                gsz gszVar = (gsz) this.a;
                gszVar.i = null;
                View view = gszVar.e;
                if (view == null || gszVar.d == -1) {
                    return;
                }
                if (gszVar.b == null) {
                    gszVar.b = (ObjectAnimator) AnimatorInflater.loadAnimator(view.getContext(), R.animator.f360_resource_name_obfuscated_res_0x7f020002);
                    gszVar.b.setProperty(gsz.a);
                    gszVar.b.addListener(gszVar.j);
                }
                gszVar.b.setTarget(view);
                ObjectAnimator objectAnimator = gszVar.b;
                if (objectAnimator.isRunning() && (i2 = gszVar.f) >= 0) {
                    gszVar.b(i2);
                }
                objectAnimator.addListener(gszVar.j);
                gszVar.f = gszVar.d;
                gszVar.d = -1;
                gszVar.e = null;
                objectAnimator.start();
                return;
            case 16:
                AccessPointsPanel accessPointsPanel = (AccessPointsPanel) this.a;
                accessPointsPanel.b = false;
                accessPointsPanel.d();
                return;
            case 17:
                try {
                    ((Dialog) this.a).cancel();
                    return;
                } catch (IllegalArgumentException e3) {
                    ((ltd) ((ltd) ((ltd) gtz.a.d()).i(e3)).k("com/google/android/libraries/inputmethod/alertdialog/AbstractAlertDialogBuilder", "lambda$maybeRegisterInputSessionListener$0", 'B', "AbstractAlertDialogBuilder.java")).t("Failed to dismiss dialog");
                    return;
                }
            case 18:
                Object obj6 = this.a;
                ltg ltgVar = gwj.a;
                try {
                    Class.forName("com.google.android.libraries.inputmethod.cache.module.AutoDirectoryCleanerModule$DirectoryAutoCleanerTaskRunner");
                    return;
                } catch (ClassNotFoundException unused2) {
                    gwj.e((Context) obj6);
                    return;
                }
            case 19:
                gwv gwvVar = (gwv) this.a;
                gwvVar.b = null;
                ?? r12 = gwvVar.a;
                gwvVar.a = null;
                if (r12 == 0) {
                    return;
                }
                r12.run();
                return;
            default:
                ((gxa) this.a).p();
                return;
        }
    }
}
