package defpackage;

import java.util.Collection;
import java.util.Date;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* compiled from: PG */
/* renamed from: glk  reason: default package */
/* loaded from: classes.dex */
final class glk extends RequestFinishedInfo.Listener {
    public glk(Executor executor) {
        super(executor);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        Collection annotations = requestFinishedInfo.getAnnotations();
        if (annotations != null) {
            for (Object obj : annotations) {
                if (obj instanceof blo) {
                    blo bloVar = (blo) obj;
                    Long sentByteCount = requestFinishedInfo.getMetrics().getSentByteCount();
                    Long receivedByteCount = requestFinishedInfo.getMetrics().getReceivedByteCount();
                    long longValue = sentByteCount != null ? sentByteCount.longValue() : 0L;
                    long longValue2 = receivedByteCount != null ? receivedByteCount.longValue() : 0L;
                    RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
                    nfh t = lzv.r.t();
                    boolean socketReused = metrics.getSocketReused();
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    lzv lzvVar = (lzv) t.b;
                    lzvVar.a |= 32768;
                    lzvVar.q = socketReused;
                    Date requestStart = metrics.getRequestStart();
                    if (requestStart != null) {
                        long time = requestStart.getTime();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar2 = (lzv) t.b;
                        lzvVar2.a |= 1;
                        lzvVar2.b = time;
                    }
                    Date requestEnd = metrics.getRequestEnd();
                    if (requestEnd != null) {
                        long time2 = requestEnd.getTime();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar3 = (lzv) t.b;
                        lzvVar3.a |= 2;
                        lzvVar3.c = time2;
                    }
                    Date dnsStart = metrics.getDnsStart();
                    if (dnsStart != null) {
                        long time3 = dnsStart.getTime();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar4 = (lzv) t.b;
                        lzvVar4.a |= 4;
                        lzvVar4.d = time3;
                    }
                    Date dnsEnd = metrics.getDnsEnd();
                    if (dnsEnd != null) {
                        long time4 = dnsEnd.getTime();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar5 = (lzv) t.b;
                        lzvVar5.a |= 8;
                        lzvVar5.e = time4;
                    }
                    Date connectStart = metrics.getConnectStart();
                    if (connectStart != null) {
                        long time5 = connectStart.getTime();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar6 = (lzv) t.b;
                        lzvVar6.a |= 16;
                        lzvVar6.f = time5;
                    }
                    Date connectEnd = metrics.getConnectEnd();
                    if (connectEnd != null) {
                        long time6 = connectEnd.getTime();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar7 = (lzv) t.b;
                        lzvVar7.a |= 32;
                        lzvVar7.g = time6;
                    }
                    Date sslStart = metrics.getSslStart();
                    if (sslStart != null) {
                        long time7 = sslStart.getTime();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar8 = (lzv) t.b;
                        lzvVar8.a |= 64;
                        lzvVar8.h = time7;
                    }
                    Date sslEnd = metrics.getSslEnd();
                    if (sslEnd != null) {
                        long time8 = sslEnd.getTime();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar9 = (lzv) t.b;
                        lzvVar9.a |= 128;
                        lzvVar9.i = time8;
                    }
                    Date sendingStart = metrics.getSendingStart();
                    if (sendingStart != null) {
                        long time9 = sendingStart.getTime();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar10 = (lzv) t.b;
                        lzvVar10.a |= 256;
                        lzvVar10.j = time9;
                    }
                    Date sendingEnd = metrics.getSendingEnd();
                    if (sendingEnd != null) {
                        long time10 = sendingEnd.getTime();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar11 = (lzv) t.b;
                        lzvVar11.a |= 512;
                        lzvVar11.k = time10;
                    }
                    Date pushStart = metrics.getPushStart();
                    if (pushStart != null) {
                        long time11 = pushStart.getTime();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar12 = (lzv) t.b;
                        lzvVar12.a |= 1024;
                        lzvVar12.l = time11;
                    }
                    Date pushEnd = metrics.getPushEnd();
                    if (pushEnd != null) {
                        long time12 = pushEnd.getTime();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar13 = (lzv) t.b;
                        lzvVar13.a |= 2048;
                        lzvVar13.m = time12;
                    }
                    Date responseStart = metrics.getResponseStart();
                    if (responseStart != null) {
                        long time13 = responseStart.getTime();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar14 = (lzv) t.b;
                        lzvVar14.a |= 4096;
                        lzvVar14.n = time13;
                    }
                    Long ttfbMs = metrics.getTtfbMs();
                    if (ttfbMs != null) {
                        long longValue3 = ttfbMs.longValue();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar15 = (lzv) t.b;
                        lzvVar15.a |= 8192;
                        lzvVar15.o = longValue3;
                    }
                    Long totalTimeMs = metrics.getTotalTimeMs();
                    if (totalTimeMs != null) {
                        long longValue4 = totalTimeMs.longValue();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        lzv lzvVar16 = (lzv) t.b;
                        lzvVar16.a |= 16384;
                        lzvVar16.p = longValue4;
                    }
                    bloVar.d(longValue, longValue2, (lzv) t.cz());
                    return;
                }
            }
        }
    }
}
