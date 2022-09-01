package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.IntentFilter;
import android.os.Process;
import android.util.Log;
import com.google.android.apps.inputmethod.latin.keyboard.LatinHandwritingPrimeKeyboard;
import com.google.android.inputmethod.latin.R;
import java.lang.ref.WeakReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: att  reason: default package */
/* loaded from: classes.dex */
public final class att implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ att(asp aspVar, int i) {
        this.b = i;
        this.a = aspVar;
    }

    public att(atw atwVar, int i) {
        this.b = i;
        this.a = atwVar;
    }

    public att(awf awfVar, int i) {
        this.b = i;
        this.a = awfVar;
    }

    public att(bdf bdfVar, int i, byte[] bArr) {
        this.b = i;
        this.a = bdfVar;
    }

    public att(bdy bdyVar, int i) {
        this.b = i;
        this.a = bdyVar;
    }

    public att(beo beoVar, int i) {
        this.b = i;
        this.a = beoVar;
    }

    public /* synthetic */ att(bnk bnkVar, int i) {
        this.b = i;
        this.a = bnkVar;
    }

    public /* synthetic */ att(boq boqVar, int i) {
        this.b = i;
        this.a = boqVar;
    }

    public /* synthetic */ att(boy boyVar, int i) {
        this.b = i;
        this.a = boyVar;
    }

    public att(bpi bpiVar, int i) {
        this.b = i;
        this.a = bpiVar;
    }

    public att(bpr bprVar, int i) {
        this.b = i;
        this.a = bprVar;
    }

    public att(LatinHandwritingPrimeKeyboard latinHandwritingPrimeKeyboard, int i) {
        this.b = i;
        this.a = latinHandwritingPrimeKeyboard;
    }

    public att(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    public /* synthetic */ att(WeakReference weakReference, int i) {
        this.b = i;
        this.a = weakReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bdj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, beo] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ?? r0 = this.a;
                ((atw) r0).c.a(r0);
                return;
            case 1:
                ((asp) this.a).b();
                return;
            case 2:
                this.a.cancel(true);
                return;
            case 3:
                Process.setThreadPriority(10);
                this.a.run();
                return;
            case 4:
                Object obj = this.a;
                while (true) {
                    boolean z = ((awf) obj).c;
                    try {
                        ((awf) obj).c((awe) ((awf) obj).b.remove());
                        awd awdVar = ((awf) obj).d;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 5:
                bdf bdfVar = (bdf) this.a;
                if (!((bde) bdfVar.b).a) {
                    return;
                }
                ((bbk) bdfVar.a).b();
                return;
            case 6:
                bdy bdyVar = (bdy) this.a;
                bdyVar.d = bdyVar.c();
                try {
                    Object obj2 = this.a;
                    ((bdy) obj2).b.registerReceiver(((bdy) obj2).f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    ((bdy) this.a).e = true;
                    return;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e);
                    }
                    ((bdy) this.a).e = false;
                    return;
                }
            case 7:
                if (!((bdy) this.a).e) {
                    return;
                }
                ((bdy) this.a).e = false;
                bdy bdyVar2 = (bdy) this.a;
                bdyVar2.b.unregisterReceiver(bdyVar2.f);
                return;
            case 8:
                boolean z2 = ((bdy) this.a).d;
                bdy bdyVar3 = (bdy) this.a;
                bdyVar3.d = bdyVar3.c();
                if (z2 == ((bdy) this.a).d) {
                    return;
                }
                bdy bdyVar4 = (bdy) this.a;
                bgj.k(new bdx(bdyVar4, bdyVar4.d, 0));
                return;
            case 9:
                Object obj3 = this.a;
                ((mik) obj3).p(((bnk) obj3).a);
                return;
            case 10:
                ((boq) this.a).e = true;
                return;
            case 11:
                ((boq) this.a).e = false;
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj4 = this.a;
                lug lugVar = boq.a;
                final boq boqVar = (boq) ((WeakReference) obj4).get();
                if (boqVar == null) {
                    return;
                }
                ieh.j().e(dda.CONTACTS_PERMISSION_NOTICE_STATUS, 1);
                ijt e2 = ijt.e(boqVar);
                e2.q(e2.c(new ty() { // from class: bom
                    @Override // defpackage.ty
                    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
                        boq boqVar2 = boq.this;
                        for (String str : strArr) {
                            if (!str.equals("android.permission.READ_CONTACTS")) {
                                ((luc) boq.a.a(hip.a).k("com/google/android/apps/inputmethod/latin/LatinIMEBase", "lambda$updateContactsPermission$7", 526, "LatinIMEBase.java")).t("Unexpected permission when requesting READ_CONTACTS");
                            } else if (!ijw.c(boqVar2, "android.permission.READ_CONTACTS")) {
                                boqVar2.v.q(R.string.f161460_resource_name_obfuscated_res_0x7f1406b3, false);
                                ieh.j().e(dda.CONTACTS_PERMISSION_NOTICE_STATUS, 4);
                            } else {
                                boqVar2.v.q(R.string.f161460_resource_name_obfuscated_res_0x7f1406b3, true);
                                ieh.j().e(dda.CONTACTS_PERMISSION_NOTICE_STATUS, 3);
                            }
                        }
                    }
                }), "android.permission.READ_CONTACTS");
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((boq) this.a).v.q(R.string.f160600_resource_name_obfuscated_res_0x7f140659, true);
                ieh.j().e(dda.CONTACTS_PERMISSION_NOTICE_STATUS, 0);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj5 = this.a;
                ins insVar = new ins(8);
                insVar.a(R.id.f68400_resource_name_obfuscated_res_0x7f0b08e4);
                ((dcu) obj5).aC(insVar);
                return;
            case 15:
                ((boq) this.a).v.q(R.string.f160390_resource_name_obfuscated_res_0x7f140644, true);
                return;
            case 16:
                boq boqVar2 = (boq) this.a;
                boqVar2.i(boqVar2.f.a);
                return;
            case 17:
                boz bozVar = ((boy) this.a).a;
                if (!bozVar.c()) {
                    return;
                }
                bozVar.e();
                return;
            case 18:
                bpi bpiVar = (bpi) this.a;
                if (bpiVar.j) {
                    bpiVar.j();
                    return;
                } else {
                    bpiVar.b.c(bpiVar.g, null, true);
                    return;
                }
            case 19:
                bpi bpiVar2 = ((LatinHandwritingPrimeKeyboard) this.a).a;
                if (bpiVar2 != null) {
                    bpiVar2.close();
                    ((LatinHandwritingPrimeKeyboard) this.a).a = null;
                }
                bpl bplVar = ((LatinHandwritingPrimeKeyboard) this.a).b;
                if (bplVar == null) {
                    return;
                }
                bplVar.g = null;
                return;
            default:
                bpr bprVar = (bpr) this.a;
                Animator loadAnimator = AnimatorInflater.loadAnimator(bprVar.f.getContext(), R.animator.f930_resource_name_obfuscated_res_0x7f020047);
                loadAnimator.setTarget(bprVar.f);
                loadAnimator.addListener(new bpq(bprVar));
                loadAnimator.start();
                bprVar.g = loadAnimator;
                return;
        }
    }
}
