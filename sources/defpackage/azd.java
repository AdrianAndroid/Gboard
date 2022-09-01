package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* compiled from: PG */
/* renamed from: azd  reason: default package */
/* loaded from: classes.dex */
public final class azd implements azn {
    private final /* synthetic */ int a;
    private final Object b;

    public azd(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public azd(Context context, int i, byte[] bArr) {
        this.a = i;
        this.b = context.getApplicationContext();
    }

    public azd(ays aysVar, int i) {
        this.a = i;
        this.b = aysVar;
    }

    public azd(azb azbVar, int i) {
        this.a = i;
        this.b = azbVar;
    }

    public azd(azn aznVar, int i) {
        this.a = i;
        this.b = aznVar;
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    public azd(Context context, int i, char[] cArr) {
        this.a = i;
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.azn
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.a;
        if (i == 0) {
            File file = (File) obj;
            return true;
        } else if (i == 1) {
            byte[] bArr = (byte[]) obj;
            return true;
        } else if (i == 2) {
            return cf.d((Uri) obj);
        } else {
            if (i == 3) {
                String str = (String) obj;
                return true;
            } else if (i == 4) {
                Uri uri = (Uri) obj;
                return cf.d(uri) && !cf.f(uri);
            } else if (i == 5) {
                Uri uri2 = (Uri) obj;
                return cf.d(uri2) && cf.f(uri2);
            } else {
                URL url = (URL) obj;
                return true;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [azb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [azn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [azn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ays] */
    /* JADX WARN: Type inference failed for: r0v8, types: [azn, java.lang.Object] */
    @Override // defpackage.azn
    public final /* synthetic */ fws b(Object obj, int i, int i2, ava avaVar) {
        Uri c;
        Long l;
        int i3 = this.a;
        if (i3 == 0) {
            File file = (File) obj;
            return new fws(new bfu(file), new aza(file, this.b, 0));
        } else if (i3 == 1) {
            byte[] bArr = (byte[]) obj;
            return new fws(new bfu(bArr), new ayt(bArr, this.b));
        } else if (i3 == 2) {
            Uri uri = (Uri) obj;
            return new fws(new bfu(uri), new azj((Context) this.b, uri));
        } else if (i3 == 3) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                c = null;
            } else if (str.charAt(0) == '/') {
                c = c(str);
            } else {
                Uri parse = Uri.parse(str);
                c = parse.getScheme() == null ? c(str) : parse;
            }
            if (c != null && this.b.a(c)) {
                return this.b.b(c, i, i2, avaVar);
            }
            return null;
        } else if (i3 == 4) {
            Uri uri2 = (Uri) obj;
            if (!cf.e(i, i2)) {
                return null;
            }
            bfu bfuVar = new bfu(uri2);
            Context context = (Context) this.b;
            return new fws(bfuVar, aza.b(context, uri2, new awa(context.getContentResolver())));
        } else if (i3 == 5) {
            Uri uri3 = (Uri) obj;
            if (!cf.e(i, i2) || (l = (Long) avaVar.b(bbz.a)) == null || l.longValue() != -1) {
                return null;
            }
            bfu bfuVar2 = new bfu(uri3);
            Context context2 = (Context) this.b;
            return new fws(bfuVar2, aza.b(context2, uri3, new awb(context2.getContentResolver())));
        } else {
            return this.b.b(new aze((URL) obj), i, i2, avaVar);
        }
    }
}
