package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: lbh  reason: default package */
/* loaded from: classes.dex */
public final class lbh {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final List e;
    public final List f;
    public final PendingIntent g;
    public final List h;
    private final int i;

    public lbh() {
    }

    public lbh(int i, int i2, int i3, long j, long j2, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.a = i;
        this.b = i2;
        this.i = i3;
        this.c = j;
        this.d = j2;
        this.e = list;
        this.f = list2;
        this.g = pendingIntent;
        this.h = list3;
    }

    public static lbh a(int i, int i2, int i3, long j, long j2, List list, List list2) {
        return new lbh(i, i2, i3, j, j2, list, list2, null, null);
    }

    public static lbh b(Bundle bundle) {
        return new lbh(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public final List c() {
        List list = this.f;
        return list != null ? new ArrayList(list) : new ArrayList();
    }

    public final List d() {
        List list = this.e;
        return list != null ? new ArrayList(list) : new ArrayList();
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lbh) {
            lbh lbhVar = (lbh) obj;
            if (this.a == lbhVar.a && this.b == lbhVar.b && this.i == lbhVar.i && this.c == lbhVar.c && this.d == lbhVar.d && ((list = this.e) != null ? list.equals(lbhVar.e) : lbhVar.e == null) && ((list2 = this.f) != null ? list2.equals(lbhVar.f) : lbhVar.f == null) && ((pendingIntent = this.g) != null ? pendingIntent.equals(lbhVar.g) : lbhVar.g == null)) {
                List list3 = this.h;
                List list4 = lbhVar.h;
                if (list3 != null ? list3.equals(list4) : list4 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.i;
        long j = this.c;
        long j2 = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        return "SplitInstallSessionState{sessionId=" + i + ", status=" + i2 + ", errorCode=" + i3 + ", bytesDownloaded=" + j + ", totalBytesToDownload=" + j2 + ", moduleNamesNullable=" + valueOf + ", languagesNullable=" + valueOf2 + ", resolutionIntent=" + valueOf3 + ", splitFileIntents=" + valueOf4 + "}";
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.i;
        long j = this.c;
        long j2 = this.d;
        int i4 = (((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        List list = this.e;
        int i5 = 0;
        int hashCode = (i4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.g;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.h;
        if (list3 != null) {
            i5 = list3.hashCode();
        }
        return hashCode3 ^ i5;
    }
}
