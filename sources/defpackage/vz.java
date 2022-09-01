package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: vz  reason: default package */
/* loaded from: classes2.dex */
public final class vz extends wc {
    private static int f(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    private static final Font g(FontFamily fontFamily, int i) {
        int i2 = 1;
        FontStyle fontStyle = new FontStyle(1 != (i & 1) ? 400 : 700, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int f = f(fontStyle, font.getStyle());
        while (i2 < fontFamily.getSize()) {
            Font font2 = fontFamily.getFont(i2);
            int f2 = f(fontStyle, font2.getStyle());
            int i3 = f2 < f ? f2 : f;
            if (f2 < f) {
                font = font2;
            }
            i2++;
            f = i3;
        }
        return font;
    }

    @Override // defpackage.wc
    public final Typeface a(Context context, vc vcVar, Resources resources, int i) {
        vd[] vdVarArr;
        try {
            FontFamily.Builder builder = null;
            for (vd vdVar : vcVar.a) {
                try {
                    Font build = new Font.Builder(resources, vdVar.f).setWeight(vdVar.b).setSlant(vdVar.c ? 1 : 0).setTtcIndex(vdVar.e).setFontVariationSettings(vdVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.wc
    public final Typeface b(Context context, gjk[] gjkVarArr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (gjk gjkVar : gjkVarArr) {
                try {
                    ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor((Uri) gjkVar.e, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Font build = new Font.Builder(openFileDescriptor).setWeight(gjkVar.b).setSlant(gjkVar.c ? 1 : 0).setTtcIndex(gjkVar.a).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(build);
                            } else {
                                builder.addFont(build);
                            }
                            openFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (IOException unused2) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i).getStyle()).build();
        } catch (Exception unused3) {
            return null;
        }
    }

    @Override // defpackage.wc
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wc
    public final Typeface k(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wc
    public final gjk l(gjk[] gjkVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
