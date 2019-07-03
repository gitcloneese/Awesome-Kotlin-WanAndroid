package com.lxm.wanandroid.ui


import android.view.View
import android.widget.ImageView
import com.lxm.wanandroid.R
import com.lxm.wanandroid.repository.model.ArticleBean
import com.lxm.wanandroid.ui.base.BaseRecyclerAdapter
import com.lxm.wanandroid.ui.base.BaseRecyclerViewHolder

class ArticleAdapter : BaseRecyclerAdapter<ArticleBean>() {

    override fun getItemLayout(): Int {
        return R.layout.item_view
    }

    override fun onBindViewHoder(holder: BaseRecyclerViewHolder, position: Int) {
        var articleBean: ArticleBean = mutableList?.get(position)
        holder.setValue(R.id.tv_title, articleBean.title)
        holder.setValue(R.id.tv_time, articleBean.niceDate)
        holder.setValue(R.id.tv_author, articleBean.author)
        holder.setValue(R.id.iv_image, articleBean.envelopePic)
        holder.setValue(R.id.tv_tag_name, articleBean.superChapterName+"/"+ articleBean.chapterName)
        val isNewImageView: ImageView  = holder.getView(R.id.iv_new) as ImageView
        if(articleBean.fresh){
            isNewImageView.visibility = View.VISIBLE
        }else{
            isNewImageView.visibility = View.GONE
        }
    }

}