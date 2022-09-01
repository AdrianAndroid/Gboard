package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: dlq  reason: default package */
/* loaded from: classes.dex */
public final class dlq {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/keyboard/KeyboardPreviewRenderer");
    public final Context b;
    public final iss c;
    public final ice[] d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final gwk i;
    public final boolean j;
    public final boolean k;
    public final ViewGroup[] l;
    public final EditorInfo m;
    private final Context n;

    public dlq(Context context, iss issVar, ice[] iceVarArr, float f) {
        this(context, issVar, iceVarArr, f, false);
    }

    public final Bitmap a(dlp dlpVar, ibz ibzVar) {
        String c = c(this.b, dlpVar, ibzVar);
        try {
            return (Bitmap) kcu.S(this.i.a(c, kcu.C()));
        } catch (ExecutionException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/keyboard/KeyboardPreviewRenderer", "getCachedBitmap", 447, "KeyboardPreviewRenderer.java")).w("Failed to load a cached bitmap: %s", c);
            return null;
        }
    }

    public final Drawable b() {
        Drawable[] drawableArr = new Drawable[2];
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicWidth((int) (this.f * this.e));
        shapeDrawable.setIntrinsicHeight((int) (this.g * this.e));
        shapeDrawable.setAlpha(0);
        shapeDrawable.getPaint().setColor(0);
        drawableArr[0] = shapeDrawable;
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.f144720_resource_name_obfuscated_res_0x7f0e04fe, (ViewGroup) null, false);
        Drawable background = inflate.getBackground();
        inflate.setBackground(null);
        if (background == null) {
            background = new ShapeDrawable(new RectShape());
        }
        drawableArr[1] = background;
        return new LayerDrawable(drawableArr);
    }

    public final String c(Context context, dlp dlpVar, ibz ibzVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        ice[] iceVarArr = this.d;
        int length = iceVarArr.length;
        for (int i = 0; i < 2; i++) {
            sb.append(iceVarArr[i].ordinal());
        }
        int round = Math.round(this.e * 100.0f);
        int round2 = Math.round(this.h * 100.0f);
        String str2 = true != this.j ? "Off" : "On";
        String str3 = true != this.k ? "Hide" : "Show";
        String str4 = dlpVar.b;
        String b = dlpVar.b();
        String valueOf = String.valueOf(ibzVar);
        String str5 = ((ess) this.c).b;
        String obj = sb.toString();
        Object obj2 = dlpVar.f.b;
        int i2 = context.getApplicationContext().getResources().getConfiguration().orientation;
        if (i2 == 1) {
            str = "_port";
        } else if (i2 != 2) {
            str = "_orientation" + i2;
        } else {
            str = "_land";
        }
        String str6 = "preview_" + str4 + "_" + b + "_" + valueOf + "_" + str5 + "_t" + obj + "_sp" + round + "_khp" + round2 + "_mp" + str2 + "_cck" + ((String) obj2) + "_es" + str3 + str;
        String concat = String.valueOf(jbs.a(str6)).concat(".png");
        dll.a.b.put(concat, str6);
        return concat;
    }

    public final void d(dlp dlpVar, Bitmap bitmap) {
        dlpVar.c.b(dlpVar.b(), new BitmapDrawable(this.n.getResources(), bitmap));
    }

    public final dln e(iav iavVar, String str, hqt hqtVar, ibz ibzVar, jls jlsVar, dlm dlmVar) {
        hjg.q();
        dlp dlpVar = new dlp(this, iavVar, str, hqtVar, jlsVar, dlmVar, null);
        Bitmap a2 = a(dlpVar, ibzVar);
        if (a2 != null) {
            d(dlpVar, a2);
            return null;
        }
        dlpVar.e(ibzVar);
        if (dlpVar.d) {
            return null;
        }
        return dlpVar;
    }

    public dlq(Context context, iss issVar, ice[] iceVarArr, float f, boolean z) {
        int b;
        this.l = new ViewGroup[ice.values().length];
        erc ercVar = new erc(context, new eqt(issVar, 0));
        this.n = ercVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(ercVar, 0);
        this.b = contextThemeWrapper;
        this.c = issVar;
        jco.d(issVar, contextThemeWrapper);
        this.d = iceVarArr;
        this.e = f;
        this.f = gvv.b(contextThemeWrapper);
        if (z) {
            b = dds.g(contextThemeWrapper, iceVarArr);
        } else {
            b = dds.b(contextThemeWrapper, iceVarArr, 1);
        }
        this.g = b;
        this.h = dds.a(contextThemeWrapper);
        gwg a2 = gwj.a(context, "keyboard_preview");
        a2.c();
        a2.b();
        this.i = new gwk(a2.a(), haq.a);
        this.j = !lre.aG(ercVar, null);
        this.k = ino.M(context).aj(R.string.f162510_resource_name_obfuscated_res_0x7f14071c);
        EditorInfo editorInfo = new EditorInfo();
        editorInfo.inputType = 1;
        this.m = editorInfo;
    }
}
