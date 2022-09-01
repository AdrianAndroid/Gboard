package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* renamed from: hcy  reason: default package */
/* loaded from: classes.dex */
public abstract class hcy extends ls {
    private static final ltg d = ltg.j("com/google/android/libraries/inputmethod/emoji/picker/ItemListHolderAdapter");
    Context o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int E(ViewGroup viewGroup) {
        return (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(View view, hcq hcqVar) {
        ImageView imageView = (ImageView) view.findViewById(R.id.f130430_resource_name_obfuscated_res_0x7f0b21e5);
        if (imageView == null) {
            ((ltd) ((ltd) d.d()).k("com/google/android/libraries/inputmethod/emoji/picker/ItemListHolderAdapter", "updateVisibilityOfVariantAvailabilityIndicator", 36, "ItemListHolderAdapter.java")).t("Unable to find variant availability indicator view");
        } else if (hcqVar.e.length > 0) {
            imageView.setImageDrawable(this.o.getDrawable(R.drawable.f49130_resource_name_obfuscated_res_0x7f080298));
            imageView.setVisibility(0);
        } else {
            imageView.setImageDrawable(null);
            imageView.setVisibility(8);
        }
    }

    @Override // defpackage.ls
    public final void t(mo moVar) {
        if (moVar instanceof hcx) {
            hcx hcxVar = (hcx) moVar;
            return;
        }
        EmojiView emojiView = (EmojiView) moVar.a.findViewById(R.id.f54310_resource_name_obfuscated_res_0x7f0b0193);
        if (emojiView == null) {
            return;
        }
        emojiView.c = hei.a;
        emojiView.a = emojiView.a.b("");
        emojiView.b();
        emojiView.c(null);
    }
}
