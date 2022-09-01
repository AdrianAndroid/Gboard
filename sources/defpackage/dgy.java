package defpackage;

import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dgy  reason: default package */
/* loaded from: classes.dex */
public final class dgy extends gxu {
    final /* synthetic */ dgz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgy(dgz dgzVar) {
        super("RecognitionTask");
        this.a = dgzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((ltd) ((ltd) dgz.f.b()).k("com/google/android/apps/inputmethod/libs/handwriting/recognition/AbstractHandwritingRecognizerWrapper$RecognitionTask", "run", 190, "AbstractHandwritingRecognizerWrapper.java")).t("handleRecognition()");
        kcq j = this.a.m.j();
        if (j == null) {
            return;
        }
        gpi gpiVar = (gpi) this.a.l.get();
        if (gpiVar == null) {
            ((ltd) ((ltd) dgz.f.c()).k("com/google/android/apps/inputmethod/libs/handwriting/recognition/AbstractHandwritingRecognizerWrapper$RecognitionTask", "run", 198, "AbstractHandwritingRecognizerWrapper.java")).t("handleRecognition(): recognizer not set");
            return;
        }
        Object obj = j.b;
        gpq gpqVar = (gpq) obj;
        int size = gpqVar.size();
        gpqVar.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            gpm b = gpiVar.b((gpq) obj);
            if (!((AtomicBoolean) j.c).get()) {
                int codePointCount = b.a() > 0 ? b.b(0).a.codePointCount(0, b.b(0).a.length()) : 0;
                dgz dgzVar = this.a;
                dgzVar.d(dgzVar.i, size, codePointCount, true, SystemClock.elapsedRealtime() - elapsedRealtime);
            }
            List e = this.a.j.e(b);
            int[] a = dhc.a(b, gpqVar);
            if (((AtomicBoolean) j.c).get()) {
                return;
            }
            this.a.h.execute(new dgx(this, j, e, a, null, null));
        } catch (gph e2) {
            ((ltd) ((ltd) ((ltd) dgz.f.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/handwriting/recognition/AbstractHandwritingRecognizerWrapper$RecognitionTask", "run", (char) 230, "AbstractHandwritingRecognizerWrapper.java")).t("handleRecognition()");
            dgz dgzVar2 = this.a;
            dgzVar2.d(dgzVar2.i, gpqVar.size(), 0, false, SystemClock.elapsedRealtime() - elapsedRealtime);
        }
    }
}
