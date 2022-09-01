package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ahx  reason: default package */
/* loaded from: classes.dex */
public final class ahx implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    private final Preference a;

    public ahx(Preference preference) {
        this.a = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        CharSequence m = this.a.m();
        if (!this.a.E || TextUtils.isEmpty(m)) {
            return;
        }
        contextMenu.setHeaderTitle(m);
        contextMenu.add(0, 0, 0, R.string.f149790_resource_name_obfuscated_res_0x7f140145).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        CharSequence m = this.a.m();
        ((ClipboardManager) this.a.j.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", m));
        if (Build.VERSION.SDK_INT <= 32) {
            Context context = this.a.j;
            Toast.makeText(context, context.getString(R.string.f162790_resource_name_obfuscated_res_0x7f140739, m), 0).show();
        }
        return true;
    }
}
