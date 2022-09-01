package defpackage;

import android.widget.PopupWindow;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;

/* compiled from: PG */
/* renamed from: dww  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dww implements PopupWindow.OnDismissListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dww(dxa dxaVar, int i) {
        this.b = i;
        this.a = dxaVar;
    }

    public /* synthetic */ dww(eco ecoVar, int i) {
        this.b = i;
        this.a = ecoVar;
    }

    public dww(gx gxVar, int i) {
        this.b = i;
        this.a = gxVar;
    }

    public /* synthetic */ dww(hbs hbsVar, int i) {
        this.b = i;
        this.a = hbsVar;
    }

    public /* synthetic */ dww(hce hceVar, int i) {
        this.b = i;
        this.a = hceVar;
    }

    public /* synthetic */ dww(hen henVar, int i) {
        this.b = i;
        this.a = henVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i = this.b;
        if (i == 0) {
            ((dxa) this.a).d = null;
        } else if (i == 1) {
            ((gx) this.a).c();
        } else if (i == 2) {
            eco ecoVar = (eco) this.a;
            gqa.a(ecoVar.v).j(R.string.f149490_resource_name_obfuscated_res_0x7f14011b);
            ecoVar.y.set(true);
        } else if (i == 3) {
            gqa.a(((hbs) this.a).b).j(R.string.f149490_resource_name_obfuscated_res_0x7f14011b);
        } else if (i == 4) {
            hci hciVar = ((hce) this.a).a;
            gqa.a(hciVar.g).j(R.string.f149490_resource_name_obfuscated_res_0x7f14011b);
            EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = hciVar.q;
            if (emojiPickerBodyRecyclerView == null) {
                return;
            }
            emojiPickerBodyRecyclerView.a(true);
        } else {
            ((hen) this.a).a();
        }
    }
}
