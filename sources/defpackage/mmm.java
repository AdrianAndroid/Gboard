package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: mmm  reason: default package */
/* loaded from: classes2.dex */
public final class mmm {
    public final String a;
    public final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public mmm(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        fyb.aE(!fsi.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mmm)) {
            return false;
        }
        mmm mmmVar = (mmm) obj;
        return fyb.aJ(this.b, mmmVar.b) && fyb.aJ(this.a, mmmVar.a) && fyb.aJ(this.c, mmmVar.c) && fyb.aJ(this.d, mmmVar.d) && fyb.aJ(this.e, mmmVar.e) && fyb.aJ(this.f, mmmVar.f) && fyb.aJ(this.g, mmmVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        fyb.aL("applicationId", this.b, arrayList);
        fyb.aL("apiKey", this.a, arrayList);
        fyb.aL("databaseUrl", this.c, arrayList);
        fyb.aL("gcmSenderId", this.e, arrayList);
        fyb.aL("storageBucket", this.f, arrayList);
        fyb.aL("projectId", this.g, arrayList);
        return fyb.aK(arrayList, this);
    }
}
