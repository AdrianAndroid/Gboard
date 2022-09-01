package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Picture;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* compiled from: PG */
/* renamed from: bjd  reason: default package */
/* loaded from: classes.dex */
public final class bjd {
    public static final ewj f = new ewj((char[]) null);
    public bie a = null;
    public final float b = 96.0f;
    public final bgt c = new bgt();
    final Map d = new HashMap();
    public float e = 1.0f;

    public static float a(Resources resources) {
        return resources.getDisplayMetrics().densityDpi / 160.0f;
    }

    public static bjd e(AssetManager assetManager, String str) {
        bkd bkdVar = new bkd();
        InputStream open = assetManager.open(str);
        try {
            return bkdVar.b(open);
        } finally {
            try {
                open.close();
            } catch (IOException unused) {
            }
        }
    }

    public static bjd f(InputStream inputStream) {
        return new bkd().b(inputStream);
    }

    public static bjd g(Context context, int i) {
        Resources resources = context.getResources();
        bkd bkdVar = new bkd();
        InputStream openRawResource = resources.openRawResource(i);
        try {
            return bkdVar.b(openRawResource);
        } finally {
            try {
                openRawResource.close();
            } catch (IOException unused) {
            }
        }
    }

    private final bik j(bii biiVar, String str) {
        bik j;
        bik bikVar = (bik) biiVar;
        if (str.equals(bikVar.o)) {
            return bikVar;
        }
        for (bim bimVar : biiVar.n()) {
            if (bimVar instanceof bik) {
                bik bikVar2 = (bik) bimVar;
                if (str.equals(bikVar2.o)) {
                    return bikVar2;
                }
                if ((bimVar instanceof bii) && (j = j((bii) bimVar, str)) != null) {
                    return j;
                }
            }
        }
        return null;
    }

    private final bhb k() {
        int i;
        float f2;
        int i2;
        bie bieVar = this.a;
        bho bhoVar = bieVar.c;
        bho bhoVar2 = bieVar.d;
        if (bhoVar == null || bhoVar.f() || (i = bhoVar.b) == 9 || i == 2 || i == 3) {
            return new bhb(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float g = bhoVar.g();
        if (bhoVar2 == null) {
            bhb bhbVar = bieVar.w;
            f2 = bhbVar != null ? (bhbVar.d * g) / bhbVar.c : g;
        } else if (bhoVar2.f() || (i2 = bhoVar2.b) == 9 || i2 == 2 || i2 == 3) {
            return new bhb(-1.0f, -1.0f, -1.0f, -1.0f);
        } else {
            f2 = bhoVar2.g();
        }
        return new bhb(0.0f, 0.0f, g, f2);
    }

    public final float b() {
        if (this.a == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return k().d;
    }

    public final float c() {
        if (this.a == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return k().c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final bim d(String str) {
        String substring;
        if (str == null || str.length() <= 1 || !str.startsWith("#") || (substring = str.substring(1)) == null || substring.length() == 0) {
            return null;
        }
        if (substring.equals(this.a.o)) {
            return this.a;
        }
        if (this.d.containsKey(substring)) {
            return (bim) this.d.get(substring);
        }
        bik j = j(this.a, substring);
        this.d.put(substring, j);
        return j;
    }

    public final void h(float f2) {
        float b = b();
        float c = c();
        if (b <= 0.0f || c <= 0.0f) {
            return;
        }
        float f3 = b * f2;
        bie bieVar = this.a;
        if (bieVar != null) {
            bieVar.d = new bho(f3);
            bieVar.c = new bho(c * f2);
            this.e *= f2;
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public final Picture i(int i, int i2, djc djcVar) {
        Picture picture = new Picture();
        bjo bjoVar = new bjo(picture.beginRecording(i, i2), new bhb(0.0f, 0.0f, i, i2));
        if (djcVar != null) {
            bjoVar.c = (bhf) djcVar.b;
            bjoVar.d = (bhf) djcVar.a;
        }
        bjoVar.e = this;
        bie bieVar = this.a;
        if (bieVar == null) {
            bjo.h("Nothing to render. Document is empty.", new Object[0]);
        } else {
            bjoVar.f = new bjk();
            bjoVar.g = new Stack();
            bjoVar.g(bjoVar.f, bid.a());
            bjk bjkVar = bjoVar.f;
            bjkVar.f = bjoVar.b;
            bjkVar.h = false;
            bjkVar.i = false;
            bjoVar.g.push(bjkVar.clone());
            new Stack();
            new Stack();
            bjoVar.i = new Stack();
            bjoVar.h = new Stack();
            bjoVar.d(bieVar);
            bjoVar.f(bieVar, bieVar.c, bieVar.d, bieVar.w, bieVar.v);
        }
        picture.endRecording();
        return picture;
    }
}
