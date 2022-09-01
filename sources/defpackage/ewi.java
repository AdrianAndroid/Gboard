package defpackage;

import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.trainingcache.ekho.LearningController;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ewi  reason: default package */
/* loaded from: classes.dex */
public final class ewi {
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/ekho/InputContextPusher");
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    private final Executor d;
    private hpy e;
    private final hqi f;
    private final hst g;
    private final gsd h;

    public ewi(Executor executor, gsd gsdVar, byte[] bArr, byte[] bArr2) {
        ewg ewgVar = new ewg(this);
        this.f = ewgVar;
        ewh ewhVar = new ewh(this);
        this.g = ewhVar;
        this.d = executor;
        this.h = gsdVar;
        ewhVar.g(executor);
        ewgVar.g(executor);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ewe, java.lang.Object] */
    private final void c(nno nnoVar) {
        gsd gsdVar = this.h;
        if (gsdVar.a.d()) {
            ((LearningController) gsdVar.b).a();
            LearningController.nativeOnInputContextSnapshot(nnoVar.q());
        }
    }

    private static final nno d(hpy hpyVar, int i) {
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
            EditorInfo b = hsu.b();
            if (b == null) {
                ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/ekho/InputContextPusher", "getInputContextSnapshot", 154, "InputContextPusher.java")).t("EditorInfo is null!");
            } else {
                int i14 = b.fieldId;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                nno nnoVar8 = (nno) t.b;
                nnoVar8.a |= 128;
                nnoVar8.i = i14;
                int i15 = b.inputType;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                nno nnoVar9 = (nno) t.b;
                nnoVar9.a |= 1024;
                nnoVar9.l = i15;
                int i16 = b.imeOptions;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                nno nnoVar10 = (nno) t.b;
                nnoVar10.a |= 2048;
                nnoVar10.m = i16;
                if (!TextUtils.isEmpty(b.privateImeOptions)) {
                    String str = b.privateImeOptions;
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    nno nnoVar11 = (nno) t.b;
                    str.getClass();
                    nnoVar11.a |= 4096;
                    nnoVar11.n = str;
                }
                if (!TextUtils.isEmpty(b.label)) {
                    String obj2 = b.label.toString();
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    nno nnoVar12 = (nno) t.b;
                    obj2.getClass();
                    nnoVar12.a |= 256;
                    nnoVar12.j = obj2;
                }
                if (!TextUtils.isEmpty(b.hintText)) {
                    String obj3 = b.hintText.toString();
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

    public final synchronized void a() {
        if (this.b.compareAndSet(true, false)) {
            c(d(this.e, 3));
        }
    }

    public final synchronized void b(hpy hpyVar) {
        this.e = hpyVar;
        c(d(hpyVar, true != this.a.compareAndSet(true, false) ? 4 : 2));
    }
}
