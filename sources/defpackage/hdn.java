package defpackage;

import android.view.inputmethod.EditorInfo;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hdn  reason: default package */
/* loaded from: classes.dex */
public final class hdn implements hho {
    public long g;
    public EditorInfo i;
    public boolean j;
    public static final lug a = hin.a;
    private static final lfy l = lfy.c(',');
    public static final hhl b = hhq.h("emoji_compat_version_representatives", "\u1fae0,😮\u200d💨,🥲,🧑\u200d🦽,🥱,🥰,🤪,♀️,🤣");
    public static final hhl c = hhq.a("check_emoji_compat_version", true);
    public static final hhl d = hhq.h("emoji_compat_app_whitelist", "");
    public static final hdn instance = new hdn();
    public static boolean e = false;
    private llp m = llp.q();
    public final us k = new hdk(this);
    public final Set f = new HashSet();
    public hdl h = hdl.a;
    private final iqe n = iqe.g("");

    public static boolean g(hdl hdlVar) {
        return hdz.a().g("🥱", hdlVar);
    }

    private final boolean k(hdz hdzVar, hdl hdlVar) {
        llp llpVar = this.m;
        int size = llpVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            String str = (String) llpVar.get(i);
            if (!hdzVar.g(str, hdl.a)) {
                i++;
                if (hdzVar.g(str, hdlVar)) {
                    hdlVar.a();
                    break;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final adq b() {
        if (!e) {
            return null;
        }
        adq b2 = adq.b();
        if (b2.a() != 1) {
            return null;
        }
        return b2;
    }

    public final hdl c(EditorInfo editorInfo) {
        hdz a2 = hdz.a();
        if (b() != null && this.n.j(ham.m(editorInfo))) {
            return k(a2, hdl.b) ? hdl.b : hdl.a;
        } else if (editorInfo.extras == null) {
            return hdl.a;
        } else {
            Object obj = editorInfo.extras.get("android.support.text.emoji.emojiCompat_metadataVersion");
            if (obj == null) {
                return hdl.a;
            }
            if (!(obj instanceof Integer)) {
                ((luc) ((luc) a.b()).k("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager", "getCompatMetaDataGeneric", 506, "EmojiCompatManager.java")).w("EmojiCompat.EDITOR_INFO_METAVERSION_KEY must be Integer but given %s", obj.getClass());
                return hdl.a;
            }
            hdl hdlVar = new hdl(((Integer) obj).intValue(), editorInfo.extras.getBoolean("android.support.text.emoji.emojiCompat_replaceAll", false));
            return (!((Boolean) c.c()).booleanValue() || k(a2, hdlVar)) ? hdlVar : hdl.a;
        }
    }

    public final void d() {
        this.n.h((String) d.c());
    }

    public final void e(EditorInfo editorInfo) {
        this.i = editorInfo;
        hdl c2 = c(editorInfo);
        if (c2.equals(this.h)) {
            return;
        }
        this.h = c2;
        synchronized (this.f) {
            for (hdm hdmVar : this.f) {
                hdmVar.b(c2);
            }
        }
    }

    public final void f() {
        this.m = llp.o(l.k((CharSequence) b.c()));
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        if (set.contains(d)) {
            d();
        }
        if (set.contains(b)) {
            f();
        }
        EditorInfo editorInfo = this.i;
        if (editorInfo != null) {
            e(editorInfo);
        }
    }

    public final void i(hdm hdmVar) {
        synchronized (this.f) {
            this.f.add(hdmVar);
        }
    }

    public final void j(hdm hdmVar) {
        synchronized (this.f) {
            this.f.remove(hdmVar);
        }
    }
}
