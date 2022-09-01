package com.google.android.libraries.assistant.soda;

import com.google.android.libraries.assistant.soda.data.SodaDataProviderJni;
import com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Soda {
    public static final ltg a = ltg.j("com/google/android/libraries/assistant/soda/Soda");
    public long b;
    public gic c;
    public mld d;
    private long g;
    private boolean h;
    private gid i;
    private final Object e = new Object();
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final AtomicBoolean j = new AtomicBoolean(false);

    public Soda(gid gidVar) {
        new AtomicReference();
        if (!gif.a() && !gif.b()) {
            ((ltd) ((ltd) gif.a.c()).k("com/google/android/libraries/assistant/soda/SodaJniLoader", "loadNativeLibrary", 72, "SodaJniLoader.java")).t("Unable to load any SODA native library");
        }
        h();
        this.i = gidVar;
    }

    private final void h() {
        if (this.g == 0) {
            this.g = nativeCreateSodaSharedResources();
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/assistant/soda/Soda", "createNativeSoda", 979, "Soda.java")).t("Creating new SodaSharedResources");
        } else {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/assistant/soda/Soda", "createNativeSoda", 981, "Soda.java")).t("Reusing cached SodaSharedResources");
        }
        this.b = nativeConstruct(this.g);
    }

    private native void nativeAddAudio(long j, ByteBuffer byteBuffer, long j2);

    private native void nativeAddTimestampedAudio(long j, ByteBuffer byteBuffer, long j2, ByteBuffer byteBuffer2, long j3);

    private native void nativeCancelAsr(long j);

    private native long nativeCreateSodaSharedResources();

    private native void nativeDelete(long j);

    private native void nativeDeleteSodaSharedResources(long j);

    private native byte[] nativeEnrollForVoiceMatch(long j, byte[] bArr);

    private native void nativeExecuteTasks(long j, byte[] bArr);

    private native byte[] nativeFixRecognition(long j, byte[] bArr, byte[] bArr2);

    private native byte[] nativeGetSpeakerIdEnrollmentInfo(long j);

    private native boolean nativeHasConfigChanged(long j, byte[] bArr);

    private native byte[] nativeInit(long j, byte[] bArr);

    private native void nativeLogEvents(long j, byte[] bArr);

    private native void nativeSetDataProvider(long j, SodaDataProviderJni sodaDataProviderJni);

    private native void nativeSetTransportFactory(long j, SodaTransportFactory sodaTransportFactory);

    private native void nativeStartAsr(long j, int i);

    private native byte[] nativeStartCapture(long j, byte[] bArr);

    private native void nativeStopCapture(long j);

    private native void nativeUpdateContext(long j, byte[] bArr);

    private native void nativeUpdateRecognitionContext(long j, byte[] bArr);

    private native void nativeUpdateRuntime(long j, byte[] bArr);

    public final njq a(nmn nmnVar) {
        njq njqVar;
        g();
        nfh t = njq.c.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((njq) t.b).a = 0;
        njq njqVar2 = (njq) t.cz();
        if (this.f.compareAndSet(false, true)) {
            try {
                njqVar = (njq) ((nfh) njq.c.t().cr(nativeStartCapture(this.b, nmnVar.q()), nfb.b())).cz();
            } catch (ngd unused) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/Soda", "startCapture", 392, "Soda.java")).t("Failed to deserialize received bytes to com.google.rpc.Status proto");
                nfh t2 = njq.c.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                njq njqVar3 = (njq) t2.b;
                njqVar3.a = 13;
                njqVar3.b = "failed to deserialize received bytes to com.google.rpc.Status proto";
                njqVar = (njq) t2.cz();
                f();
            }
            if (njqVar.a == 0) {
                return njqVar;
            }
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/Soda", "startCapture", 403, "Soda.java")).t("Failed to start a SODA capture session");
            this.f.set(false);
            return njqVar;
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/Soda", "startCapture", 410, "Soda.java")).t("Another SODA capture session is active. Ignoring startCapture request.");
        nfh t3 = njq.c.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        njq njqVar4 = (njq) t3.b;
        njqVar4.a = 10;
        njqVar4.b = "another SODA capture session is active, ignoring startCapture request";
        return (njq) t3.cz();
    }

    public final synchronized nmi b(nln nlnVar) {
        gie gieVar;
        ldu lduVar = ldu.a;
        if (nlnVar == null) {
            throw new NullPointerException("Null sodaCoreConfig");
        }
        gieVar = new gie(nlnVar, lduVar, lduVar);
        jdg.u(gieVar.a);
        return c(gieVar);
    }

    public final void d(ByteBuffer byteBuffer, int i) {
        g();
        nativeAddAudio(this.b, byteBuffer, i);
    }

    public final synchronized void e() {
        long j = this.b;
        if (j != 0) {
            nativeDelete(j);
            this.b = 0L;
            nativeDeleteSodaSharedResources(this.g);
            this.g = 0L;
        }
        this.h = false;
    }

    public final void f() {
        mko mkoVar;
        g();
        nativeStopCapture(this.b);
        gic gicVar = this.c;
        if (gicVar != null) {
            synchronized (gicVar.g) {
                if (gicVar.f != null && (mkoVar = gicVar.h) != null && !mkoVar.isDone() && !gicVar.f.isDone()) {
                    gicVar.f.cancel(true);
                    gicVar.i = mld.e();
                }
            }
            mld mldVar = gicVar.i;
            if (mldVar == null) {
                return;
            }
            try {
                mldVar.get();
            } catch (InterruptedException | ExecutionException e) {
                ((ltd) ((ltd) ((ltd) gic.a.c()).i(e)).k("com/google/android/libraries/assistant/soda/SodaAudioPusher", "stopRunner", (char) 249, "SodaAudioPusher.java")).t("Exception occurred when trying to stop pushing SODA audio.");
            }
        }
    }

    protected final void finalize() {
        e();
    }

    public final void g() {
        if (this.b != 0) {
            return;
        }
        throw new IllegalStateException("SODA Android is not initialized");
    }

    protected void handleShutdown() {
        synchronized (this.e) {
        }
    }

    protected void handleSodaEvent(byte[] bArr) {
        gid gidVar;
        nlx nlxVar;
        nlq nlqVar;
        synchronized (this.e) {
            nlz nlzVar = (nlz) ((nfj) ((nfj) nlz.f.t()).cr(bArr, nfb.b())).cz();
            nly nlyVar = nlzVar.b;
            if (nlyVar == null) {
                nlyVar = nly.f;
            }
            int W = ndb.W(nlyVar.c);
            if (W != 0 && W == 4 && (gidVar = this.i) != null) {
                nfh t = nlh.e.t();
                nly nlyVar2 = nlzVar.b;
                int i = 3;
                if ((nlyVar2 == null ? nly.f : nlyVar2).a == 1) {
                    if (nlyVar2 == null) {
                        nlyVar2 = nly.f;
                    }
                    if (nlyVar2.a == 1) {
                        nlqVar = (nlq) nlyVar2.b;
                    } else {
                        nlqVar = nlq.f;
                    }
                    if (nlqVar.b.size() > 0) {
                        String str = (String) nlqVar.b.get(0);
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        nlh nlhVar = (nlh) t.b;
                        str.getClass();
                        nlhVar.a |= 2;
                        nlhVar.c = str;
                    }
                    if ((nlqVar.a & 32) != 0) {
                        nmc nmcVar = nlqVar.c;
                        if (nmcVar == null) {
                            nmcVar = nmc.b;
                        }
                        String str2 = nmcVar.a;
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        nlh nlhVar2 = (nlh) t.b;
                        str2.getClass();
                        nlhVar2.a |= 4;
                        nlhVar2.d = str2;
                    }
                } else if ((nlyVar2 == null ? nly.f : nlyVar2).a == 4) {
                    if (nlyVar2 == null) {
                        nlyVar2 = nly.f;
                    }
                    if (nlyVar2.a == 4) {
                        nlxVar = (nlx) nlyVar2.b;
                    } else {
                        nlxVar = nlx.e;
                    }
                    if (nlxVar.b.size() > 0) {
                        String str3 = (String) nlxVar.b.get(0);
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        nlh nlhVar3 = (nlh) t.b;
                        str3.getClass();
                        nlhVar3.a |= 2;
                        nlhVar3.c = str3;
                    }
                    if ((nlxVar.a & 16) != 0) {
                        nmc nmcVar2 = nlxVar.c;
                        if (nmcVar2 == null) {
                            nmcVar2 = nmc.b;
                        }
                        String str4 = nmcVar2.a;
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        nlh nlhVar4 = (nlh) t.b;
                        str4.getClass();
                        nlhVar4.a |= 4;
                        nlhVar4.d = str4;
                    }
                    i = 2;
                }
                nly nlyVar3 = nlzVar.b;
                if (nlyVar3 == null) {
                    nlyVar3 = nly.f;
                }
                for (nlu nluVar : nlyVar3.e) {
                    nfh t2 = nmj.d.t();
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    nmj nmjVar = (nmj) t2.b;
                    nmjVar.b = i - 1;
                    nmjVar.a |= 1;
                    nlg nlgVar = nluVar.a;
                    if (nlgVar == null) {
                        nlgVar = nlg.c;
                    }
                    nfh t3 = nli.c.t();
                    int i2 = nlgVar.a;
                    if (i2 == 9) {
                        int aa = ndb.aa(((Integer) nlgVar.b).intValue());
                        if (aa == 0) {
                            aa = 1;
                        }
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        nli nliVar = (nli) t3.b;
                        nliVar.b = Integer.valueOf(aa - 1);
                        nliVar.a = 1;
                    } else if (i2 == 8) {
                        String str5 = (String) nlgVar.b;
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        nli nliVar2 = (nli) t3.b;
                        str5.getClass();
                        nliVar2.a = 2;
                        nliVar2.b = str5;
                    }
                    nli nliVar3 = (nli) t3.cz();
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    nmj nmjVar2 = (nmj) t2.b;
                    nliVar3.getClass();
                    nmjVar2.c = nliVar3;
                    nmjVar2.a |= 4;
                    nmj nmjVar3 = (nmj) t2.cz();
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    nlh nlhVar5 = (nlh) t.b;
                    nmjVar3.getClass();
                    nga ngaVar = nlhVar5.b;
                    if (!ngaVar.c()) {
                        nlhVar5.b = nfm.H(ngaVar);
                    }
                    nlhVar5.b.add(nmjVar3);
                }
                nfj nfjVar = (nfj) nlz.f.t();
                nfjVar.d(nlh.f, (nlh) t.cz());
                gidVar.a((nlz) nfjVar.cz());
            }
            gid gidVar2 = this.i;
            if (gidVar2 != null) {
                gidVar2.a(nlzVar);
            }
        }
    }

    protected void handleStart() {
        synchronized (this.e) {
            this.j.set(false);
        }
    }

    protected void handleStop(int i) {
        this.f.set(false);
        synchronized (this.e) {
        }
        mld mldVar = this.d;
        if (mldVar != null) {
            mldVar.c(null);
        }
    }

    public native void nativeCollectDebugInfo(long j, boolean z);

    public native long nativeConstruct(long j);

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (r4 == 1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.nmi c(defpackage.gie r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.h     // Catch: java.lang.Throwable -> Lcb
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L31
            nmi r9 = defpackage.nmi.d     // Catch: java.lang.Throwable -> Lcb
            nfh r9 = r9.t()     // Catch: java.lang.Throwable -> Lcb
            boolean r0 = r9.c     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto L17
            r9.cD()     // Catch: java.lang.Throwable -> Lcb
            r9.c = r1     // Catch: java.lang.Throwable -> Lcb
        L17:
            nfm r0 = r9.b     // Catch: java.lang.Throwable -> Lcb
            nmi r0 = (defpackage.nmi) r0     // Catch: java.lang.Throwable -> Lcb
            r0.b = r2     // Catch: java.lang.Throwable -> Lcb
            int r1 = r0.a     // Catch: java.lang.Throwable -> Lcb
            r1 = r1 | r3
            r0.a = r1     // Catch: java.lang.Throwable -> Lcb
            r1 = r1 | r2
            r0.a = r1     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = "SODA cannot be initialized more than once."
            r0.c = r1     // Catch: java.lang.Throwable -> Lcb
            nfm r9 = r9.cz()     // Catch: java.lang.Throwable -> Lcb
            nmi r9 = (defpackage.nmi) r9     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r8)
            return r9
        L31:
            nln r9 = r9.a     // Catch: java.lang.Throwable -> Lcb
            long r4 = r8.b     // Catch: java.lang.Throwable -> Lcb
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L3e
            r8.h()     // Catch: java.lang.Throwable -> Lcb
        L3e:
            r8.g()     // Catch: java.lang.Throwable -> Lcb
            long r4 = r8.b     // Catch: java.lang.Throwable -> Lcb
            byte[] r9 = r9.q()     // Catch: java.lang.Throwable -> Lcb
            byte[] r9 = r8.nativeInit(r4, r9)     // Catch: java.lang.Throwable -> Lcb
            r0 = 6
            if (r9 != 0) goto L7a
            r8.e()     // Catch: java.lang.Throwable -> Lcb
            nmi r9 = defpackage.nmi.d     // Catch: java.lang.Throwable -> Lcb
            nfh r9 = r9.t()     // Catch: java.lang.Throwable -> Lcb
            boolean r4 = r9.c     // Catch: java.lang.Throwable -> Lcb
            if (r4 == 0) goto L60
            r9.cD()     // Catch: java.lang.Throwable -> Lcb
            r9.c = r1     // Catch: java.lang.Throwable -> Lcb
        L60:
            nfm r1 = r9.b     // Catch: java.lang.Throwable -> Lcb
            nmi r1 = (defpackage.nmi) r1     // Catch: java.lang.Throwable -> Lcb
            r1.b = r0     // Catch: java.lang.Throwable -> Lcb
            int r0 = r1.a     // Catch: java.lang.Throwable -> Lcb
            r0 = r0 | r3
            r1.a = r0     // Catch: java.lang.Throwable -> Lcb
            r0 = r0 | r2
            r1.a = r0     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = "Unable to parse ConfigResult:  Serialized ConfigResult is null."
            r1.c = r0     // Catch: java.lang.Throwable -> Lcb
            nfm r9 = r9.cz()     // Catch: java.lang.Throwable -> Lcb
            nmi r9 = (defpackage.nmi) r9     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r8)
            return r9
        L7a:
            nmi r4 = defpackage.nmi.d     // Catch: defpackage.ngd -> L9f java.lang.Throwable -> Lcb
            nfh r4 = r4.t()     // Catch: defpackage.ngd -> L9f java.lang.Throwable -> Lcb
            nfb r5 = defpackage.nfb.b()     // Catch: defpackage.ngd -> L9f java.lang.Throwable -> Lcb
            ndt r9 = r4.cr(r9, r5)     // Catch: defpackage.ngd -> L9f java.lang.Throwable -> Lcb
            nfh r9 = (defpackage.nfh) r9     // Catch: defpackage.ngd -> L9f java.lang.Throwable -> Lcb
            nfm r9 = r9.cz()     // Catch: defpackage.ngd -> L9f java.lang.Throwable -> Lcb
            nmi r9 = (defpackage.nmi) r9     // Catch: defpackage.ngd -> L9f java.lang.Throwable -> Lcb
            int r4 = r9.b     // Catch: defpackage.ngd -> L9f java.lang.Throwable -> Lcb
            int r4 = defpackage.ndb.Y(r4)     // Catch: defpackage.ngd -> L9f java.lang.Throwable -> Lcb
            if (r4 != 0) goto L99
            goto L9b
        L99:
            if (r4 != r3) goto L9d
        L9b:
            r8.h = r3     // Catch: defpackage.ngd -> L9f java.lang.Throwable -> Lcb
        L9d:
            monitor-exit(r8)
            return r9
        L9f:
            r8.e()     // Catch: java.lang.Throwable -> Lcb
            nmi r9 = defpackage.nmi.d     // Catch: java.lang.Throwable -> Lcb
            nfh r9 = r9.t()     // Catch: java.lang.Throwable -> Lcb
            boolean r4 = r9.c     // Catch: java.lang.Throwable -> Lcb
            if (r4 == 0) goto Lb1
            r9.cD()     // Catch: java.lang.Throwable -> Lcb
            r9.c = r1     // Catch: java.lang.Throwable -> Lcb
        Lb1:
            nfm r1 = r9.b     // Catch: java.lang.Throwable -> Lcb
            nmi r1 = (defpackage.nmi) r1     // Catch: java.lang.Throwable -> Lcb
            r1.b = r0     // Catch: java.lang.Throwable -> Lcb
            int r0 = r1.a     // Catch: java.lang.Throwable -> Lcb
            r0 = r0 | r3
            r1.a = r0     // Catch: java.lang.Throwable -> Lcb
            r0 = r0 | r2
            r1.a = r0     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = "Unable to parse ConfigResult: InvalidProtocolBufferException"
            r1.c = r0     // Catch: java.lang.Throwable -> Lcb
            nfm r9 = r9.cz()     // Catch: java.lang.Throwable -> Lcb
            nmi r9 = (defpackage.nmi) r9     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r8)
            return r9
        Lcb:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.soda.Soda.c(gie):nmi");
    }
}
