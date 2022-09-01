package defpackage;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cfk  reason: default package */
/* loaded from: classes.dex */
final class cfk implements jtn {
    private final caj a;
    private final jan b;
    private final File c;
    private final File d;
    private final idk e;

    public cfk(caj cajVar, jan janVar, File file, File file2, idk idkVar) {
        this.a = cajVar;
        this.b = janVar;
        this.c = file;
        this.d = file2;
        this.e = idkVar;
    }

    @Override // defpackage.jtn
    public final /* bridge */ /* synthetic */ Object a(jrr jrrVar) {
        jrrVar.a();
        ((luc) ((luc) cfl.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightUnpacker$UnpackCancellableTask", "execute", 102, "SuperDelightUnpacker.java")).w("UnpackCancellableTask#execute(): fst-decompress %s", this.d);
        if (!this.b.c(this.c, this.d)) {
            this.e.e(cap.SUPER_DELIGHT_UNPACK, false, "CopyFailure");
            throw new IOException(String.format("Unable to copy file at %s to %s", this.c, this.d));
        }
        nfh t = mvm.l.t();
        String absolutePath = this.d.getAbsolutePath();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mvm mvmVar = (mvm) t.b;
        absolutePath.getClass();
        mvmVar.a |= 4;
        mvmVar.d = absolutePath;
        mvm mvmVar2 = (mvm) t.cz();
        cbz cbzVar = this.a.e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        mvn b = cbzVar.b(mvmVar2);
        msn decompressFstLanguageModel = cbzVar.a.decompressFstLanguageModel(b);
        cbzVar.b.g(caq.DELIGHT_DECOMPRESS_FST_LANGUAGE_MODEL, SystemClock.elapsedRealtime() - elapsedRealtime);
        cbzVar.b.e(cap.LOG_NATIVE_METRICS, Long.valueOf(b.c));
        int d = msc.d(decompressFstLanguageModel.a);
        if (d == 0 || d != 3) {
            this.e.e(cap.SUPER_DELIGHT_UNPACK, false, "Decompression");
            idk idkVar = this.e;
            cap capVar = cap.SUPER_DELIGHT_UNPACK_COMPRESSION_FAILURE;
            Object[] objArr = new Object[1];
            int d2 = msc.d(decompressFstLanguageModel.a);
            if (d2 == 0) {
                d2 = 1;
            }
            objArr[0] = Integer.valueOf(d2 - 1);
            idkVar.e(capVar, objArr);
            Locale locale = Locale.US;
            Object[] objArr2 = new Object[2];
            objArr2[0] = mvmVar2.d;
            int d3 = msc.d(decompressFstLanguageModel.a);
            if (d3 == 0) {
                d3 = 1;
            }
            objArr2[1] = Integer.valueOf(d3 - 1);
            throw new IOException(String.format(locale, "Unable to decompress file at %s due to %d", objArr2));
        }
        this.e.e(cap.SUPER_DELIGHT_UNPACK, true, null);
        return null;
    }
}
