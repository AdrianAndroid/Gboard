package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dzx  reason: default package */
/* loaded from: classes.dex */
public final class dzx implements inm, hho {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionProvider");
    public final ino b;
    public final dzi c;
    public final dzz d;
    public iqe e;
    public iqh f;
    public hiz g;
    public hiz h;
    private final Context j;
    public dat i = dat.a;
    private final hso k = new hso();

    public dzx(Context context) {
        this.j = context;
        this.c = dzi.a(context);
        this.d = new dzz(context);
        this.b = ino.M(context);
    }

    public static llp c(EditorInfo editorInfo) {
        return llp.o(ham.n(editorInfo));
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.j.getResources().getString(R.string.f149760_resource_name_obfuscated_res_0x7f140141));
        if (((Boolean) dzn.o.c()).booleanValue()) {
            sb.append(",");
            sb.append(this.j.getResources().getString(R.string.f149750_resource_name_obfuscated_res_0x7f140140));
        }
        String str = (String) dzn.n.c();
        if (!str.isEmpty()) {
            sb.append(",");
            sb.append(str);
        }
        return sb.toString();
    }

    public final void e() {
        hji.h(this.g);
        this.g = null;
        hji.h(this.h);
        this.h = null;
    }

    public final boolean f(EditorInfo editorInfo) {
        if (this.k.isFullscreenMode()) {
            return false;
        }
        if (ham.z(this.e, editorInfo)) {
            return ham.r(editorInfo, "image/png");
        }
        String str = editorInfo.packageName;
        return false;
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        this.f.h(d());
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        if (!str.equals(this.j.getString(R.string.f160760_resource_name_obfuscated_res_0x7f14066c)) || inoVar.al(this.j.getString(R.string.f160760_resource_name_obfuscated_res_0x7f14066c), true, true)) {
            return;
        }
        cri.b(this.j, "recent_content_suggestion_shared").g();
    }
}
