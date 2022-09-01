package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: kep  reason: default package */
/* loaded from: classes.dex */
final class kep implements keo {
    private final Context a;

    public kep(Context context) {
        this.a = context;
    }

    @Override // defpackage.keo
    public /* bridge */ /* synthetic */ List a(int i, int i2, String str, long j) {
        return b(0, 0, str, j);
    }

    public llp b(int i, int i2, String str, long j) {
        int i3;
        ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
        jdg.u(activityManager);
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(this.a.getPackageName(), 0, 0);
        llk e = llp.e();
        for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
            if (!applicationExitInfo.getProcessName().equals(str) || applicationExitInfo.getTimestamp() != j) {
                nfh t = omy.j.t();
                String processName = applicationExitInfo.getProcessName();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                omy omyVar = (omy) t.b;
                processName.getClass();
                omyVar.a |= 1;
                omyVar.b = processName;
                int status = applicationExitInfo.getStatus();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                omy omyVar2 = (omy) t.b;
                int i4 = 4;
                omyVar2.a |= 4;
                omyVar2.d = status;
                long timestamp = applicationExitInfo.getTimestamp();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                omy omyVar3 = (omy) t.b;
                omyVar3.a |= 16;
                omyVar3.f = timestamp;
                long pss = applicationExitInfo.getPss();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                omy omyVar4 = (omy) t.b;
                omyVar4.a |= 32;
                omyVar4.g = pss;
                long rss = applicationExitInfo.getRss();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                omy omyVar5 = (omy) t.b;
                omyVar5.a |= 64;
                omyVar5.h = rss;
                boolean isLowMemoryKillReportSupported = ActivityManager.isLowMemoryKillReportSupported();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                omy omyVar6 = (omy) t.b;
                omyVar6.a |= 128;
                omyVar6.i = isLowMemoryKillReportSupported;
                switch (applicationExitInfo.getReason()) {
                    case 0:
                        i3 = 15;
                        break;
                    case 1:
                        i3 = 2;
                        break;
                    case 2:
                        i3 = 3;
                        break;
                    case 3:
                        i3 = 4;
                        break;
                    case 4:
                        i3 = 5;
                        break;
                    case 5:
                        i3 = 6;
                        break;
                    case 6:
                        i3 = 7;
                        break;
                    case 7:
                        i3 = 8;
                        break;
                    case 8:
                        i3 = 9;
                        break;
                    case 9:
                        i3 = 10;
                        break;
                    case 10:
                        i3 = 11;
                        break;
                    case 11:
                        i3 = 12;
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        i3 = 13;
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        i3 = 14;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                if (i3 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    omy omyVar7 = (omy) t.b;
                    omyVar7.c = i3 - 1;
                    omyVar7.a |= 2;
                }
                int importance = applicationExitInfo.getImportance();
                if (importance == 100) {
                    i4 = 2;
                } else if (importance == 125) {
                    i4 = 3;
                } else if (importance == 200) {
                    i4 = 5;
                } else if (importance == 230) {
                    i4 = 6;
                } else if (importance == 300) {
                    i4 = 8;
                } else if (importance != 325) {
                    i4 = importance != 350 ? importance != 400 ? importance != 1000 ? 0 : 10 : 9 : 7;
                }
                if (i4 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    omy omyVar8 = (omy) t.b;
                    omyVar8.e = i4 - 1;
                    omyVar8.a |= 8;
                }
                e.h((omy) t.cz());
            } else {
                return e.g();
            }
        }
        return e.g();
    }
}
