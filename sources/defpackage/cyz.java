package defpackage;

import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* renamed from: cyz  reason: default package */
/* loaded from: classes.dex */
public final class cyz {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/tenor/TenorResult");
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final cyr f;
    public final int g;
    public final lfb h;
    public final cza i;

    public cyz() {
    }

    public cyz(String str, String str2, String str3, Uri uri, cyr cyrVar, int i, lfb lfbVar, cza czaVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = uri;
        this.f = cyrVar;
        this.g = i;
        this.h = lfbVar;
        this.i = czaVar;
    }

    public static llp a(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null) {
                return llp.q();
            }
            llk e = llp.e();
            for (int i = 0; i < optJSONArray.length(); i++) {
                e.h(Uri.parse(optJSONArray.getString(i)));
            }
            return e.g();
        }
        return llp.q();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyz) {
            cyz cyzVar = (cyz) obj;
            if (this.b.equals(cyzVar.b) && this.c.equals(cyzVar.c) && this.d.equals(cyzVar.d) && this.e.equals(cyzVar.e) && this.f.equals(cyzVar.f) && this.g == cyzVar.g && this.h.equals(cyzVar.h) && this.i.equals(cyzVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        int i = this.g;
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.i);
        return "TenorResult{id=" + str + ", title=" + str2 + ", h1Title=" + str3 + ", url=" + valueOf + ", mediaCollection=" + valueOf2 + ", backgroundColor=" + i + ", sponsoredData=" + valueOf3 + ", flags=" + valueOf4 + "}";
    }
}
