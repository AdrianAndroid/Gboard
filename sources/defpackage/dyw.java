package defpackage;

import android.content.Context;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IBitmojiExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiOrGifExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiSearchExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmoticonExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IGifKeyboardExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IStickerExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IUniversalMediaExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.RichSymbolExtension;
import com.google.android.inputmethod.latin.R;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dyw  reason: default package */
/* loaded from: classes.dex */
public final class dyw implements IEmojiOrGifExtension {
    public static final /* synthetic */ int i = 0;
    private static final llw k;
    private static final llw l;
    public final Context h;
    private final ino n;
    private hfy o;
    private static final ltg j = ltg.j("com/google/android/apps/inputmethod/libs/search/ArtExtension");
    static final Class a = IEmojiSearchExtension.class;
    static final Class b = IStickerExtension.class;
    static final Class c = IBitmojiExtension.class;
    static final Class d = IGifKeyboardExtension.class;
    static final Class e = IEmoticonExtension.class;
    static final Class f = RichSymbolExtension.class;
    static final Class g = IUniversalMediaExtension.class;
    private static final lmz m = lmz.t(IEmojiSearchExtension.class, IEmoticonExtension.class, RichSymbolExtension.class);

    static {
        lls i2 = llw.i(8);
        i2.a(IEmojiSearchExtension.class, bzg.u);
        i2.a(IBitmojiExtension.class, dyv.b);
        i2.a(IStickerExtension.class, dyv.a);
        i2.a(IGifKeyboardExtension.class, dyv.c);
        i2.a(IEmoticonExtension.class, dyv.d);
        i2.a(RichSymbolExtension.class, dyv.e);
        i2.a(IUniversalMediaExtension.class, dyv.f);
        k = i2.l();
        lls i3 = llw.i(8);
        i3.a(IEmojiSearchExtension.class.getName(), IEmojiSearchExtension.class);
        i3.a(IBitmojiExtension.class.getName(), IBitmojiExtension.class);
        i3.a(IStickerExtension.class.getName(), IStickerExtension.class);
        i3.a(IGifKeyboardExtension.class.getName(), IGifKeyboardExtension.class);
        i3.a(IEmoticonExtension.class.getName(), IEmoticonExtension.class);
        i3.a(RichSymbolExtension.class.getName(), RichSymbolExtension.class);
        i3.a(IUniversalMediaExtension.class.getName(), IUniversalMediaExtension.class);
        l = i3.l();
    }

    public dyw(Context context, ino inoVar) {
        this.h = context;
        this.n = inoVar;
    }

    static final Class g(String str, Class cls) {
        Class cls2 = (Class) l.get(str);
        return cls2 != null ? cls2 : cls;
    }

    public final hfy c() {
        hfy hfyVar = this.o;
        if (hfyVar != null) {
            return hfyVar;
        }
        throw new IllegalStateException("Delegate is not set");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final igr d() {
        return igr.d(this.h);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("getExtensionInterface = ".concat(f(true).toString()));
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    final Class f(boolean z) {
        lfe lfeVar = null;
        Class g2 = g(this.h.getString(R.string.f148220_resource_name_obfuscated_res_0x7f140067), null);
        Class g3 = g(this.n.Q("PREF_LAST_ACTIVE_TAB"), g2);
        if (g3 != null) {
            lfeVar = (lfe) k.get(g3);
        }
        if (lfeVar == null || !lfeVar.a(this) || (!z && !m.contains(g3))) {
            ((ltd) ((ltd) j.b()).k("com/google/android/apps/inputmethod/libs/search/ArtExtension", "getExtensionInterface", 234, "ArtExtension.java")).w("Overrode art extension %s", g3);
        } else {
            g2 = g3;
        }
        if (g2 == null) {
            g2 = a;
        }
        ((ltd) ((ltd) j.b()).k("com/google/android/apps/inputmethod/libs/search/ArtExtension", "getExtensionInterface", 240, "ArtExtension.java")).w("Opening art extension %s", g2);
        return g2;
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ArtExtension";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
    }

    @Override // defpackage.ifw
    public final void gn() {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hfx
    public final void i() {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final void k(hfy hfyVar) {
        this.o = hfyVar;
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        iap iapVar;
        Class f2 = f(z);
        igg c2 = d().c(f2.asSubclass(ifw.class));
        String string = this.h.getString(R.string.f148230_resource_name_obfuscated_res_0x7f140068);
        if (c2 == null || (iapVar = c2.e) == null) {
            ((ltd) j.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/ArtExtension", "switchKeyboard", 145, "ArtExtension.java")).w("can't get the default keyboard from the extension %s to open", f2);
        } else {
            string = iapVar.c(R.id.f54800_resource_name_obfuscated_res_0x7f0b01c8, string).toString();
        }
        if (f2.equals(e) || f2.equals(a) || f2.equals(d) || f2.equals(g) || f2.equals(b) || f2.equals(c) || f2.equals(f)) {
            c().z(hfd.d(new iay(-10104, null, new icz(string, dip.h(hfl.EXTERNAL)))));
        } else {
            c().z(hfd.d(new iay(-10058, null, f2)));
        }
        hfy hfyVar = this.o;
        if (hfyVar != null) {
            hfyVar.y();
            return true;
        }
        return true;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void q() {
    }
}
