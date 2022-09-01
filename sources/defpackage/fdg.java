package defpackage;

import android.content.Context;
import android.content.LocusId;
import android.text.TextUtils;
import android.view.contentcapture.ContentCaptureManager;
import android.view.contentcapture.DataShareRequest;
import android.view.inputmethod.EditorInfo;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fdg  reason: default package */
/* loaded from: classes.dex */
public final class fdg implements fer {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingService");
    public static final LocusId b = new LocusId("Gboard_InputContext");
    public static volatile ContentCaptureManager c;
    private static volatile fdg d;
    private hpy i;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final hqi j = new fdd(this);
    private final hst k = new fde(this);
    private final Executor h = gxo.a(11);

    private fdg() {
    }

    public static fdg a() {
        fdg fdgVar = d;
        if (fdgVar == null) {
            synchronized (fdg.class) {
                fdgVar = d;
                if (fdgVar == null) {
                    fdgVar = new fdg();
                    d = fdgVar;
                }
            }
        }
        return fdgVar;
    }

    public static boolean f(Context context) {
        c = (ContentCaptureManager) context.getSystemService(ContentCaptureManager.class);
        if (c == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingService", "initializeContentCapture", 139, "InputContextSharingService.java")).t("ContentCaptureManager is null");
            return false;
        } else if (c.isContentCaptureEnabled()) {
            return true;
        } else {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingService", "initializeContentCapture", 143, "InputContextSharingService.java")).t("ContentCaptureManager is not enabled");
            return false;
        }
    }

    private final synchronized void g() {
        this.k.h();
        this.j.h();
        this.g.set(false);
    }

    private static final nno h(hpy hpyVar, int i) {
        nfh t = nno.q.t();
        long currentTimeMillis = System.currentTimeMillis();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nno nnoVar = (nno) t.b;
        int i2 = nnoVar.a | 1;
        nnoVar.a = i2;
        nnoVar.b = currentTimeMillis;
        int i3 = i2 | 2;
        nnoVar.a = i3;
        nnoVar.c = "";
        int i4 = hpyVar.d;
        int i5 = i3 | 4;
        nnoVar.a = i5;
        nnoVar.d = i4;
        int i6 = hpyVar.e;
        int i7 = i5 | 8;
        nnoVar.a = i7;
        nnoVar.e = i6;
        int i8 = hpyVar.f;
        int i9 = i7 | 16;
        nnoVar.a = i9;
        nnoVar.f = i8;
        int i10 = hpyVar.g;
        int i11 = i9 | 32;
        nnoVar.a = i11;
        nnoVar.g = i10;
        int i12 = hpyVar.h;
        int i13 = i11 | 64;
        nnoVar.a = i13;
        nnoVar.h = i12;
        nnoVar.o = i - 1;
        nnoVar.a = i13 | 8192;
        CharSequence charSequence = hpyVar.c;
        if (charSequence != null) {
            String obj = charSequence.toString();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nno nnoVar2 = (nno) t.b;
            obj.getClass();
            nnoVar2.a |= 2;
            nnoVar2.c = obj;
        }
        hqe hqeVar = hqe.UNKNOWN;
        int ordinal = hpyVar.b.ordinal();
        if (ordinal == 1) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nno nnoVar3 = (nno) t.b;
            nnoVar3.p = 1;
            nnoVar3.a |= 16384;
        } else if (ordinal == 2) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nno nnoVar4 = (nno) t.b;
            nnoVar4.p = 2;
            nnoVar4.a |= 16384;
        } else if (ordinal == 3) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nno nnoVar5 = (nno) t.b;
            nnoVar5.p = 3;
            nnoVar5.a |= 16384;
        } else if (ordinal != 4) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nno nnoVar6 = (nno) t.b;
            nnoVar6.p = 0;
            nnoVar6.a |= 16384;
        } else {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nno nnoVar7 = (nno) t.b;
            nnoVar7.p = 4;
            nnoVar7.a |= 16384;
        }
        if (i == 2) {
            EditorInfo b2 = hsu.b();
            if (b2 == null) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingService", "getInputContextSnapshot", 245, "InputContextSharingService.java")).t("EditorInfo is null!");
            } else {
                int i14 = b2.fieldId;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                nno nnoVar8 = (nno) t.b;
                nnoVar8.a |= 128;
                nnoVar8.i = i14;
                int i15 = b2.inputType;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                nno nnoVar9 = (nno) t.b;
                nnoVar9.a |= 1024;
                nnoVar9.l = i15;
                int i16 = b2.imeOptions;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                nno nnoVar10 = (nno) t.b;
                nnoVar10.a |= 2048;
                nnoVar10.m = i16;
                if (!TextUtils.isEmpty(b2.privateImeOptions)) {
                    String str = b2.privateImeOptions;
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    nno nnoVar11 = (nno) t.b;
                    str.getClass();
                    nnoVar11.a |= 4096;
                    nnoVar11.n = str;
                }
                if (!TextUtils.isEmpty(b2.label)) {
                    String obj2 = b2.label.toString();
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    nno nnoVar12 = (nno) t.b;
                    obj2.getClass();
                    nnoVar12.a |= 256;
                    nnoVar12.j = obj2;
                }
                if (!TextUtils.isEmpty(b2.hintText)) {
                    String obj3 = b2.hintText.toString();
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    nno nnoVar13 = (nno) t.b;
                    obj3.getClass();
                    nnoVar13.a |= 512;
                    nnoVar13.k = obj3;
                }
            }
        }
        return (nno) t.cz();
    }

    @Override // defpackage.fer
    public final synchronized void b(Context context) {
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingService", "init", 118, "InputContextSharingService.java")).t("init()");
        if (!this.g.compareAndSet(false, true)) {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingService", "init", 121, "InputContextSharingService.java")).t("InputContext sharing service already initialized.");
        } else if (!f(context)) {
            this.g.set(false);
        } else {
            this.e.set(true);
            this.f.set(true);
            this.k.g(this.h);
            this.j.g(this.h);
        }
    }

    public final synchronized void c() {
        hpy hpyVar = this.i;
        if (hpyVar == null) {
            return;
        }
        if (!this.f.compareAndSet(true, false)) {
            return;
        }
        e(h(hpyVar, 3));
        g();
    }

    public final synchronized void d(hpy hpyVar) {
        this.i = hpyVar;
        e(h(hpyVar, true != this.e.compareAndSet(true, false) ? 4 : 2));
    }

    final void e(ngz ngzVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingService", "pushInputContextSnapshot", 181, "InputContextSharingService.java")).t("pushInputContextSnapshot()");
        c.shareData(new DataShareRequest(b, "application/x-java-serialized-object"), this.h, new fdf(ngzVar, 0));
    }
}
