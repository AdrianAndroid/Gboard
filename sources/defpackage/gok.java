package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: gok  reason: default package */
/* loaded from: classes.dex */
public final class gok extends Thread {
    public boolean a;
    private final InputStream b;
    private final int c;
    private final bno d;
    private final opu e;

    public gok(InputStream inputStream, int i, bno bnoVar, opu opuVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super("MicrophoneReader");
        this.b = inputStream;
        this.c = i;
        this.d = bnoVar;
        this.e = opuVar;
        this.a = z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        InputStream inputStream;
        float sqrt;
        int i;
        float f;
        float f2;
        opu opuVar;
        jdg.u(this.b);
        byte[] bArr = new byte[this.c];
        boolean z = true;
        while (true) {
            try {
                int read = this.b.read(bArr);
                if (read == -1 || Thread.currentThread().isInterrupted()) {
                    break;
                }
                long j = 0;
                if (z && (opuVar = this.e) != null) {
                    Object obj = opuVar.a;
                    fev fevVar = ((fgc) obj).j;
                    if (fevVar != null) {
                        fevVar.f();
                        ffx ffxVar = ((fgc) obj).g;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (ffxVar.b > 0 && ffxVar.e < 0) {
                            ffxVar.e = elapsedRealtime - ffxVar.b;
                            ffxVar.l.g(fbp.S3_RECOGNIZER_READY_TIME, ffxVar.e);
                        }
                        boolean z2 = ((fgc) obj).k;
                        ((fgc) obj).f.a();
                        ffx ffxVar2 = ((fgc) obj).g;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        ffxVar2.d = elapsedRealtime2;
                        ffxVar2.m.b(elapsedRealtime2, fbp.S3_MIC_TAP_TO_START_LISTENING_TIME);
                        fevVar.a();
                    }
                }
                bno bnoVar = this.d;
                if (bnoVar != null && this.a) {
                    if (read <= 0) {
                        sqrt = 0.0f;
                    } else {
                        double d = read;
                        Double.isNaN(d);
                        double d2 = d / 2.0d;
                        long j2 = 0;
                        while (read >= 2) {
                            int i2 = bArr[read - 1] << 8;
                            read -= 2;
                            j2 += i2 + (bArr[read] & 255);
                            j += i * i;
                        }
                        double d3 = j;
                        Double.isNaN(d3);
                        double d4 = j2 * j2;
                        Double.isNaN(d4);
                        sqrt = (float) Math.sqrt(((d3 * d2) - d4) / (d2 * d2));
                    }
                    if (!bnoVar.d && sqrt == 0.0f) {
                        ((ltd) ((ltd) bno.a.d()).k("com/google/android/apps/gsa/speech/audio/SpeechLevelGenerator", "update", 28, "SpeechLevelGenerator.java")).t("Really low audio levels detected. The audio input may have issues.");
                        bnoVar.d = true;
                    }
                    float f3 = bnoVar.c;
                    if (f3 < sqrt) {
                        f = f3 * 0.999f;
                        f2 = 0.001f;
                    } else {
                        f = f3 * 0.95f;
                        f2 = 0.05f;
                    }
                    float f4 = f + (f2 * sqrt);
                    bnoVar.c = f4;
                    float f5 = -120.0f;
                    if (f4 > 0.0d) {
                        double d5 = sqrt / f4;
                        if (d5 > 1.0E-6d) {
                            f5 = ((float) Math.log10(d5)) * 10.0f;
                        }
                    }
                    int min = (int) (((Math.min(Math.max(f5, -2.0f), 10.0f) + 2.0f) * 100.0f) / 12.0f);
                    if (min < 30) {
                        min = 0;
                    }
                    int i3 = (min / 10) * 10;
                    bnc bncVar = bnoVar.b;
                    jdg.v(i3 <= 100);
                    if (((AtomicInteger) bncVar.a).getAndSet(i3) != i3) {
                        bncVar.a(i3);
                    }
                }
                z = false;
            } catch (IOException unused) {
                inputStream = this.b;
            } catch (Throwable th) {
                lyq.a(this.b);
                throw th;
            }
        }
        inputStream = this.b;
        lyq.a(inputStream);
    }
}
