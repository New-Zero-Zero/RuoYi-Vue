import request from '@/utils/request'

// 查询QA问答列表
export function listQa(query) {
  return request({
    url: '/fz/qa/list',
    method: 'get',
    params: query
  })
}

// 查询QA问答详细
export function getQa(id) {
  return request({
    url: '/fz/qa/' + id,
    method: 'get'
  })
}

// 新增QA问答
export function addQa(data) {
  return request({
    url: '/fz/qa',
    method: 'post',
    data: data
  })
}

// 修改QA问答
export function updateQa(data) {
  return request({
    url: '/fz/qa',
    method: 'put',
    data: data
  })
}

// 删除QA问答
export function delQa(id) {
  return request({
    url: '/fz/qa/' + id,
    method: 'delete'
  })
}
