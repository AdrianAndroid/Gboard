package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: jjm  reason: default package */
/* loaded from: classes.dex */
public final class jjm implements kan {
    private final rj a;

    public jjm(rj rjVar) {
        this.a = rjVar;
    }

    @Override // defpackage.kan
    public final void a(File file, kam kamVar) {
        jhu jhuVar;
        Throwable th = kamVar.c;
        file.getName();
        int i = jmk.a;
        nzv a = jhv.a();
        int i2 = kamVar.d;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        switch (i3) {
            case 0:
                jhuVar = jhu.ANDROID_DOWNLOADER_UNKNOWN;
                break;
            case 1:
                jhuVar = jhu.ANDROID_DOWNLOADER_CANCELED;
                break;
            case 2:
                jhuVar = jhu.ANDROID_DOWNLOADER_INVALID_REQUEST;
                break;
            case 3:
                jhuVar = jhu.ANDROID_DOWNLOADER_HTTP_ERROR;
                break;
            case 4:
                jhuVar = jhu.ANDROID_DOWNLOADER_REQUEST_ERROR;
                break;
            case 5:
                jhuVar = jhu.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR;
                break;
            case 6:
                jhuVar = jhu.ANDROID_DOWNLOADER_RESPONSE_CLOSE_ERROR;
                break;
            case 7:
                jhuVar = jhu.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
                break;
            case 8:
                jhuVar = jhu.ANDROID_DOWNLOADER_DISK_IO_ERROR;
                break;
            case 9:
                jhuVar = jhu.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR;
                break;
            case 10:
                jhuVar = jhu.ANDROID_DOWNLOADER_UNKNOWN_IO_ERROR;
                break;
            default:
                jhuVar = jhu.UNKNOWN_ERROR;
                break;
        }
        a.a = jhuVar;
        int i4 = kamVar.d;
        String k = mhb.k(i4);
        if (i4 != 0) {
            String str = "ANDROID_DOWNLOADER_" + k + "; ";
            int i5 = kamVar.a;
            if (i5 >= 0) {
                str = str + "HttpCode: " + i5 + "; ";
            }
            String str2 = kamVar.b;
            if (str2 != null) {
                str = str + "Message: " + str2 + "; ";
            }
            a.b = str;
            if (th != null) {
                a.c = th;
            }
            this.a.d(a.e());
            return;
        }
        throw null;
    }

    @Override // defpackage.kan
    public final void b(File file) {
        file.getName();
        int i = jmk.a;
        this.a.c(null);
    }
}
